package me.seager.neural_network;

import me.seager.neural_network.neural_networks.ActivationFunctionType;
import me.seager.neural_network.neural_networks.InputNeuron;
import me.seager.neural_network.neural_networks.NeuralNetwork;
import me.seager.neural_network.neural_networks.Neuron;

public class Main {

    public static NeuralNetwork nn;

    public static void main(String[] args) throws Exception {

        InputNeuron neuron0 = new InputNeuron(0, ActivationFunctionType.Sigmoid, 0);
        InputNeuron neuron1 = new InputNeuron(0, ActivationFunctionType.Sigmoid, 0);
        InputNeuron neuron2 = new InputNeuron(0, ActivationFunctionType.Sigmoid, 0);
        InputNeuron neuron3 = new InputNeuron(0, ActivationFunctionType.Sigmoid, 0);

        Neuron neuron4 = new Neuron(1, ActivationFunctionType.Sigmoid);
        Neuron neuron5 = new Neuron(1, ActivationFunctionType.Sigmoid);
        Neuron neuron6 = new Neuron(1, ActivationFunctionType.Sigmoid);
        Neuron neuron7 = new Neuron(1, ActivationFunctionType.Sigmoid);

        Neuron neuron8 = new Neuron(2, ActivationFunctionType.Sigmoid);
        Neuron neuron9 = new Neuron(2, ActivationFunctionType.Sigmoid);
        Neuron neuron10 = new Neuron(2, ActivationFunctionType.Sigmoid);
        Neuron neuron11 = new Neuron(2, ActivationFunctionType.Sigmoid);

        Neuron neuron12 = new Neuron(3, ActivationFunctionType.Sigmoid);
        Neuron neuron13 = new Neuron(3, ActivationFunctionType.Sigmoid);
        Neuron neuron14 = new Neuron(3, ActivationFunctionType.Sigmoid);
        Neuron neuron15 = new Neuron(3, ActivationFunctionType.Sigmoid);
        Neuron neuron16 = new Neuron(3, ActivationFunctionType.Sigmoid);
        Neuron neuron17 = new Neuron(3, ActivationFunctionType.Sigmoid);
        Neuron neuron18 = new Neuron(3, ActivationFunctionType.Sigmoid);
        Neuron neuron19 = new Neuron(3, ActivationFunctionType.Sigmoid);

        Neuron[] neurons = new Neuron[]{neuron0, neuron1, neuron2, neuron3};

        double[][] synValues = new double[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},};

        nn = new NeuralNetwork("test", neurons, synValues);
        nn.run();

    }

    }

