package agh.po.symulator;

public class Sprzeglo extends Komponent{
    public Sprzeglo(String producent,String model) {
        super(producent, model);
    }
    private boolean stanSprzegla;
    public void wcisnij(){
        this.stanSprzegla=true;
    }
    public void zwolnij(){
        this.stanSprzegla=false;
    }
}
