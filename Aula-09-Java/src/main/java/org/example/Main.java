package org.example;

public class Main {
    public static void main(String[] args){
        //Criando um carro
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.ano = 2020;
        carro.numeroDePortas = 4;
        carro.exibirDetalhesCarro();

        //Criando uma moto
        Moto moto = new Moto();
        moto.marca = "Yamaha";
        moto.ano = 2020;
        moto.temSidecar = true;
        moto.exibirDetalhesMoto();
    }
}