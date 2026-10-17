package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Program_Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista= new ArrayList<>();
        Random random = new Random();
        while(lista.size()<6) {

            int r = random.nextInt(49) + 1;
            if (!lista.contains(r))
                lista.add(r);
        }
        System.out.print(lista);
    }

}
