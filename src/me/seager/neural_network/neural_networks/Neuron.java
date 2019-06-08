package me.seager.neural_network.neural_networks;

import java.util.ArrayList;
import java.util.List;

public class Neuron {

    private int layer;
    private ActivationFunctionType aft;
    private NeuralNetwork parentNetwork;
    private int id = -1;
    private List<Double> receivedInputs = new ArrayList<>();

    public Neuron(int neuronLayer, ActivationFunctionType activationFunctionType) {
        layer = neuronLayer;
        aft = activationFunctionType;

    }

    public void receiveInput(double input, int fromWho) {
        double[][] synvals = parentNetwork.getSynaptionsValues();
        receivedInputs.add(input * synvals[fromWho][id]);
        int inputNumber = 0;
        for(int i = 0; i < synvals[fromWho].length; i++){
            if(synvals[i][id] != 0){
                inputNumber++;
            }
        }
        if(receivedInputs.size() == inputNumber){
            trigger();
        }
    }

    public void setNeuronId(int neuronId) {
        id = neuronId;
    }
    public void trigger() {
        double inputSum = 0;
        for(double input : receivedInputs) {inputSum = inputSum + input;}
        double processedOutput = MathFunction.sigmoid(inputSum);
        System.out.println("Output from neuron no. " + id + ": (Sigmoided: " + processedOutput + ", Original: " + inputSum + ")");
        double[][] synvals = parentNetwork.getSynaptionsValues();
        for(int i = 0; i < synvals[id].length; i++) {
            if(synvals[id][i] != 0){
                parentNetwork.getNeuronById(i).receiveInput(processedOutput, id);
            }
        }
    }
public void setParentNetwork(NeuralNetwork network) { parentNetwork = network; }

}
