package com.java.oops.composition.pc;

public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20,20 ,15);
        Case newCase = new Case("110-A","Dell","240",dimensions);
        Motherboard newMotherboard = new Motherboard("Asus-A1","ASUS",4,4,"Legacy");
        Monitor newMonitor = new Monitor("27-INCH","ASUS",27,new Resolution(40,20));
        PC newPC = new PC(newCase,newMonitor,newMotherboard);
        newPC.poweUp();
    }
}
