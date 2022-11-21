package com.java.abstractclass;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing out, repeat");
    }
}
