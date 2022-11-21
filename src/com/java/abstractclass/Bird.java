package com.java.abstractclass;

public  abstract class Bird  extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() +" is breathing out,repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() +" is flapping its wings");
    }
}
