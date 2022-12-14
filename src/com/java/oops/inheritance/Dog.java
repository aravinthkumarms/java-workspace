package com.java.oops.inheritance;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    public Dog(String name,int size,int weight,int eyes, int legs, int tail, int teeth){
        super(name,1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
        chew();
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
}
