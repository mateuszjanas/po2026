package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Porownanie_wynikow {
    public static void main(String[] args) {
        ArrayList<Integer> listain= new ArrayList<>();
        for (int i=0;i<6;i++){
        Scanner liczby = new Scanner((System.in));
        System.out.print("Podaj liczbe");
        listain.add(Integer.valueOf(liczby.nextLine()));
        }

        ArrayList<Integer> lista= new ArrayList<>();
        while(lista.size()<6) {
            Random random = new Random();
            int r = random.nextInt((49 - 1) + 1);
            if (!lista.contains(r))
                lista.add(r);
        }
        System.out.println(listain);
        System.out.println(lista);
        listain.retainAll(lista);
        System.out.print("liczba trafien: ");
        System.out.print(listain.size());

    }

}
