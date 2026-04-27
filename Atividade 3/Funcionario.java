package Atv3;

abstract class Funcionario {
    protected String nome;
    protected double salario;
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    abstract void calcularBonus();
}