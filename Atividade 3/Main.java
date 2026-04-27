package Atv3;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
     ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Vendedor("João", 3000));
        funcionarios.add(new Gerente("Maria", 5000));

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularBonus();
        }
    }
}