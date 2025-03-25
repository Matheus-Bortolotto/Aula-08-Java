package org.example;

public class Carro extends Veiculo{
    int numeroDePortas;

    void exibirDetalhesCarro(){
        exibirDetalhes();
        System.out.println("Números de portas: " + numeroDePortas);
    }

}
