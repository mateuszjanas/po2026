package agh.po.animals;

public abstract class Animal {
    String name;
    int legs;
    public abstract String getDescryption();

    public int getLegs(){return legs;}
}
