package com.objects;

public class Cow extends Animal{

    public Cow(){
        System.out.println("Cow created");
    }
    @Override
    void walk() {
        System.out.println("Cow walking");
    }

    public static void main(String []args){

        Animal cow = new Cow();
        cow.walk();
        cow.eat();

        Animal goat = new Goat();
        goat.walk();
        goat.eat();
    }
}

class Goat extends Animal{

    public Goat(){
        super();
        System.out.println("Goat created");
    }
    @Override
    void walk() {
        System.out.println("Goat walking");
    }
}
