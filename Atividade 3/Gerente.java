package Atv3;

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    void calcularBonus() {
       double bonus = salario * 0.2;
         System.out.println("O bônus do gerente " + nome + " é: " + bonus);
    }
}