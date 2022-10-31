package com.java.oops.classesAndObjects;

public class Car {
    private String carName;
    private String carModel;
    private Double carPrice;

    public Car(String carName,String carModel,Double carPrice){
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    public Car() {
        this("Default","Model1",0.00);
    }

    public Car(String carName,String carModel){
        this(carName,carModel,8882349.33);
    }

    public void setCarName(String carName){
        this.carName = carName;
    }

    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    public void setCarPrice(Double carPrice){
        this.carPrice = carPrice;
    }

    public String getCarName(){
        return this.carName;
    }

    public String getCarModel(){
        return this.carModel;
    }

    public Double getCarPrice(){
        return carPrice;
    }
}
