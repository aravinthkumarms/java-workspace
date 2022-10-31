package com.java.oops.composition.pc;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void poweUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo(){
        monitor.drawPixelAt(123,43,"red");
    }

}
