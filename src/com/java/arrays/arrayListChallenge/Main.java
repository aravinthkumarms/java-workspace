package com.java.arrays.arrayListChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Mobile mobile = new Mobile("8973987443");
    public static void main(String[] args){
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action: (6 to show available options");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting Down...");
                    quit = true;
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone....");
    }

    private static Contact getNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact contact = Contact.createContact(name,phone);
        return contact;
    }

    private static void addNewContact(){
       Contact contact = getNewContact();
        if(mobile.addNewContact(contact)){
            System.out.println("New contact added: "+contact.getName()+" phone :"+contact.getPhoneNumber());
        }
        else{
            System.out.println("Cannot add, "+contact.getName()+" already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contact existingContactRecord = mobile.queryContact(oldName);
        if(existingContactRecord ==null){
            System.out.println("Contact not found");
            return;
        }
       Contact contact = getNewContact();
        if(mobile.updateContact(existingContactRecord,contact)){
            System.out.println("Successfully updated contact");
        }
        else{
            System.out.println("Error Updating record");
        }
    }


    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contact existingContactRecord = mobile.queryContact(oldName);
        if(existingContactRecord ==null){
            System.out.println("Contact not found");
            return;
        }
        if(mobile.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobile.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println(  "0 - to shutdown\n"+
                                    "1 - to print contacts\n"+
                                    "2 - add new contact\n" +
                                    "3 - update existing contact\n"+
                                    "4 - to remove an existing contact\n"+
                                    "5 - query if an existing contact exists\n"+
                                    "6 - to print a list of available options"
                );
    }

}
