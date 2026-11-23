package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;
    public Pozycja(double x,double y){
        this.x=x;
        this.y=x;
    }
    public void aktualizujPozycje(double deltaX,double deltaY){
        this.x=deltaX;
        this.y=deltaY;
    }
    public String getpozycja(){
        String poz="aktualna pozycja to["+x+" "+y+"]";
        return poz;
    }
}
