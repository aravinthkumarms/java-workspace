package com.java.interfaces;

public class Main {
    public static void main(String[] args){
            ITelephone myPhone;
            myPhone = new DeskPhone(454523434);
            myPhone.powerOn();
            myPhone.callPhone(454523434);
            myPhone.answer();

            myPhone = new MobilePhone(222222);
            myPhone.powerOn();
            myPhone.callPhone(222222);
            myPhone.answer();
    }
}
