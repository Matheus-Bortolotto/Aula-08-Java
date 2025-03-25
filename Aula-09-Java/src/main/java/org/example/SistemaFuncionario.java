package org.example;

public class SistemaFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Carlos", 3000);
        Gerente gerente = new Gerente("Ana", 5000, 2000);


        func.exibirDados();
        gerente.exibirDados();
    }
}
