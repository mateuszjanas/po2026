package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzyniaBiegow;
    void wlacz(){
    silnik.uruchom();
    }
    void wylacz(){
    silnik.zatrzymaj();
    int x=skrzyniaBiegow.getAktBieg();
    for(int i=0;i<x;i++){
        skrzyniaBiegow.ZmniejszBieg();
    }
    }
}
