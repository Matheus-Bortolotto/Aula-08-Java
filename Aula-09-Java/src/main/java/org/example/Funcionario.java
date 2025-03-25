package org.example;

 public class Funcionario {
     String nome;
     double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Salário: R$ " + calcularSalario());
    }
}
