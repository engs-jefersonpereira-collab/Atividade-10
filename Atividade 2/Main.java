package Atv2;

class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla");
        Veiculo moto = new Moto("Honda", "CB500");

        carro.exibirDados();
        carro.acelerar();

        System.out.println();

        moto.exibirDados();
        moto.acelerar();
    }
}