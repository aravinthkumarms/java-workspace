package com.java.oops.exercise;

public class DeluxeHamburger extends Hamburger{

    public DeluxeHamburger() {
        super("Deluxe",15.54,"Sausage & Bacon","white");
        super.addHamburgerAddition1("chips",0.35);
        super.addHamburgerAddition2("Drink",3.3);
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }
}
