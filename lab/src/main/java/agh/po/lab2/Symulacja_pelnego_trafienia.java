package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Symulacja_pelnego_trafienia
{
    public static void main(String[] args) {
        long czasstart=System.currentTimeMillis();
        ArrayList<Integer> listain= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listain.add(Integer.valueOf(args[i]));
        }
        int liczbatr=0;
        int liczbalosowan=0;
        Random random = new Random();
        while (liczbatr<6) {
            ArrayList<Integer> lista = new ArrayList<>();

            while (lista.size() < 6) {

                int r = random.nextInt(49) + 1;
                if (!lista.contains(r))
                    lista.add(r);
            }
            lista.retainAll(listain);
            liczbatr=lista.size();
            liczbalosowan++;
            if (lista.size()==6)
            {   long czasstop=System.currentTimeMillis();
                System.out.println("Trafiono 6/6");
                System.out.print("Potrzebowano: ");
                System.out.print(liczbalosowan);
                System.out.println(" losowan");
                long czaspracy=czasstop-czasstart;
                System.out.print("Czas pracy wyniosl: ");
                System.out.print(czaspracy);
                System.out.print(" milisekund");
            }
        }
    }

}
