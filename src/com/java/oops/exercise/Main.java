package com.java.oops.exercise;

public class Main {
    public static void main(String[] args){

        Hamburger hamburger = new Hamburger("Basic",5.33,"Sausage","white");
        hamburger.addHamburgerAddition1("Tomato",0.55);
        hamburger.addHamburgerAddition2("Cheese",0.756);
        System.out.println("Total Buger Price is  "+hamburger.itemizeHamburger());

        System.out.println("------------------------------");

        HealthyBurger healthyBurger = new HealthyBurger(99.3,"Bacon");
        healthyBurger.addHamburgerAddition1("Egg",23.23);
        healthyBurger.addHealthAddition2("Ghee",3.2);
        healthyBurger.addHealthAddition1("Cheese",3.2);
        System.out.println("Total Healthy Buger Price is  "+healthyBurger.itemizeHamburger());

        System.out.println("------------------------------");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addHamburgerAddition3("Egg",23);
        System.out.println("Total Deluxe Hamburger Price is  "+deluxeHamburger.itemizeHamburger());
    }
}
