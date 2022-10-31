package com.java.oops.composition.room;

public class Main {
    public static void main(String[] args){
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,4,3,1);
        Light light = new Light("Classic",false,8);
        Room room = new Room("Aravinth",wall1,wall2,wall3,wall4,ceiling,bed,light);
        room.getLight().turnOn();
        room.makeBed();
    }
}
