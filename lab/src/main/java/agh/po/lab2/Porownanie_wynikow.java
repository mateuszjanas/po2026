package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Porownanie_wynikow {
    public static void main(String[] args) {
        ArrayList<Integer> listain= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listain.add(Integer.valueOf(args[i]));
        }
        ArrayList<Integer> lista= new ArrayList<>();
        Random random =new Random();
        while(lista.size()<6) {

            int r = random.nextInt(49) + 1;
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
