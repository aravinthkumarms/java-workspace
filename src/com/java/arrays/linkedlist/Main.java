package com.java.arrays.linkedlist;

public class Main {
    public static void main(String[] args){
            Customer customer = new Customer("Aravinth",3243);
            Customer anotherCustomer;
            anotherCustomer = customer;
            anotherCustomer.setBalance(33333);
            System.out.println("Balance for customer: "+customer.getName() +" is "+customer.getBalance());
    }
}
