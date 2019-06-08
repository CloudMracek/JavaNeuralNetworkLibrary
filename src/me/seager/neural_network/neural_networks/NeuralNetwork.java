package me.seager.neural_network.neural_networks;

public class NeuralNetwork {

    private String name;
    private Neuron[] neurons;
    private double[][] synaptionsValues;
    private double[] inputs;

    public NeuralNetwork(String networkName, Neuron[] networkNeurons, double[][] synValues) throws Exception {

        if(networkNeurons.length != synValues.length) {throw new Exception();}

        name = networkName;
        neurons = networkNeurons;
        synaptionsValues = synValues;

    }

    public void run() throws Exception {

        for(int i = 0; i < neurons.length; i++){
            neurons[i].setNeuronId(i);
            neurons[i].setParentNetwork(this);
        }
        for(Neuron n : neurons) {
            if(n instanceof InputNeuron){
                ((InputNeuron) n).startInput();
            }
        }
    }

    public double[][] getSynaptionsValues() {
        return synaptionsValues;
    }

    public Neuron getNeuronById(int neuronId) {
        return neurons[neuronId];
    }
}
