package com.java.oops.classesAndObjects;
public class ComplexNumber{
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary  + imaginary;
        return ;
    }

    public void add(ComplexNumber complexNumber){
        this. real = this.real + complexNumber.real;
        this.imaginary = this.imaginary + complexNumber.imaginary;
        return ;
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary  - imaginary;
        return;
    }

    public void subtract (ComplexNumber complexNumber){
        this.real= this.real - complexNumber.real;
        this.imaginary = this.imaginary - complexNumber.imaginary;
        return ;
    }
}

