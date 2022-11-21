package com.java.abstractclass;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Jimmy");
        dog.breathe();
        dog.eat();
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();;
        parrot.fly();
        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
