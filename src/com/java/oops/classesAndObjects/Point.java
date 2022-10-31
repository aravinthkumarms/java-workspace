package com.java.oops.classesAndObjects;

public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((this.y - 0) * (this.y - 0) + (this.x - 0) * (this.x - 0));
    }
    public double distance(int x,int y){
        return Math.sqrt((this.y - y) * (this.y - y) + (this.x - x) * (this.x - x));
    }
    public double distance(Point point){
        return Math.sqrt((y - point.y) * (y - point.y) + (x - point.x) * (x - point.x));
    }
}