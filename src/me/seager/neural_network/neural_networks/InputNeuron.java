package me.seager.neural_network.neural_networks;

import me.seager.neural_network.Main;

public class InputNeuron extends Neuron {

    private double input;
    private int id = -1;

    public InputNeuron(int neuronLayer, ActivationFunctionType activationFunctionType, double neuronInput) {
        super(neuronLayer, activationFunctionType);
        input = neuronInput;
    }

    public void startInput() throws Exception {
        if(id == -1) {throw new Exception();}
        double[][] synvals = Main.nn.getSynaptionsValues();
        for(int i = 0; i<synvals[id].length; i++){
                if(synvals[id][i] != 0){
                    Main.nn.getNeuronById(i).receiveInput(input, id);
                }
        }
    }

    public void setNeuronId(int neuronId) {
        id = neuronId;
    }



}
