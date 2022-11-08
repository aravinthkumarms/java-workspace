package com.java.arrays.autoUnBoxChallenge;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("HDFC");
        bank.addNewBranch("Kumbakonam");
        bank.addNewCustomer("Kumbakonam","Aravinth",55.33);
        bank.addNewCustomer("Kumbakonam","Ajith",882.33);
        bank.addNewCustomer("Kumbakonam","Kumar",123.2);
        bank.addNewBranch("KMU");
        bank.addNewCustomer("KMU","Ara",334);
        bank.addNewCustomer("KMU","Aji",343);
        bank.addCustomerTransaction("KMU","Ara",21312);
        bank.addCustomerTransaction("Kumbakonam","Aravinth",2132l);
        bank.listCustomers("KMU",false);
        bank.listCustomers("Kumbakonam",true);
    }
}
