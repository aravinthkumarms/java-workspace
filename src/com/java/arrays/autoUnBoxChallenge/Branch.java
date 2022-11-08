package com.java.arrays.autoUnBoxChallenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransactions(String customerName,double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer!= null){
                existingCustomer.addTransaction(amount);
                return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
       for(int i =0;i< this.customers.size();i++){
           Customer checkCustomer = this.customers.get(i);
           if(checkCustomer.getName().equals(customerName)){
               return checkCustomer;
           }
       }
       return null;
    }
}
