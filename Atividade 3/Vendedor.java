package Atv3;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    void calcularBonus() {
        double bonus = salario * 0.1;
        System.out.println("O bônus do vendedor " + nome + " é: " + bonus);
    }
    
}