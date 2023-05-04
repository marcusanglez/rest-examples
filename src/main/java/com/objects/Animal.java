package com.objects;

public abstract class Animal {
    abstract void walk();
    void eat(){
        System.out.println("Animal eating.");
    }

    public Animal(){
        System.out.println("Creating animal");
    }
}
