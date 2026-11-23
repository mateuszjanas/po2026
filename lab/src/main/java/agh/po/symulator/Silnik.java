package agh.po.symulator;

public class Silnik extends Komponent{
    public Silnik(String producent,String model) {
        super(producent, model);
    }
    private int maxObroty=5500;
    private int obroty;
    public void uruchom(){
        this.obroty=750;
    }
    public void zatrzymaj(){
        this.obroty=0;
    }
}
