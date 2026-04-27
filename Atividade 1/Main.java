package Atv1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mingau"));

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}