package com.java.oops.composition.room;

    public class Light {
    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn(){
        System.out.println("Lamp -> Turning On");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public Light(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
}
