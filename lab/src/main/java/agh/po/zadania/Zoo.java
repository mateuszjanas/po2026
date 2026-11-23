package agh.po.zadania;

import java.util.Random;
import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

public class Zoo {
    Animal[] animals = new Animal[100];
    Random random = new Random();

    public Zoo() {
        for (int i = 0; i < animals.length; i++) {
            int choice = random.nextInt(3);
            if (choice == 0) {
                animals[i] = new Dog();
            } else if (choice == 1) {
                animals[i] = new Parrot();
            } else {
                animals[i] = new Snake();
            }
        }
    }

    public int sumanog() {
        int suma = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                suma += animal.getLegs();
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Zoo mojeZoo = new Zoo();
        int wynikliczenia = mojeZoo.sumanog();
        System.out.println("Calkowita liczba nog: " + wynikliczenia);
    }
}
