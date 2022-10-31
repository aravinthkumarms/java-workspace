package com.java.oops.classesAndObjects;

import com.java.oops.inheritance.Animal;
import com.java.oops.inheritance.BMW;
import com.java.oops.inheritance.Dog;

public class Main {
    public static void main(String[] args){
//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

//        Animal animal = new Animal("Animal",1,1,5,5);
//        Dog dog = new Dog("Jimmy",8,25,2,4,1,21);
//        dog.eat();
//        dog.run();
//        dog.walk();

        BMW bmw = new BMW(36);
        bmw.steer(60);
        bmw.accelerate(50);
        bmw.accelerate(30);
        bmw.accelerate(-70);
        System.out.println(bmw.getCurrentVelocity());
        bmw.stop();
    }
}


