package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    public SkrzyniaBiegow(String producent,String model) {
        super(producent, model);
    }
    private int aktualnyBieg;
    private int iloscBiegow=4;
    public int getAktBieg(){
        return aktualnyBieg;
    }
    public void ZwiekszBieg() {
        if (aktualnyBieg < iloscBiegow) {
            this.aktualnyBieg = aktualnyBieg + 1;
        }
    }
    public void ZmniejszBieg(){
        if(aktualnyBieg>-1) {
            this.aktualnyBieg = aktualnyBieg - 1;
        }
    }

}
