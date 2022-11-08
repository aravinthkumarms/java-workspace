package com.java.arrays.arrayListChallenge;

import java.util.ArrayList;

public class Mobile {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public Mobile(String myNumber){
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){

        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() +" was not found");
            return false;
        }
        else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name "+newContact.getName()+" already exits. Update not successfull");
            return false;
        }
        this.myContact.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition <0 ){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName()+" was successfully deleted");
        return true;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int pos = findContact(name);
        if(pos>=0){
            return this.myContact.get(pos);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contacts List");
        for(int i=0;i<this.myContact.size();i++){
            System.out.println((i+1)+"."+this.myContact.get(i).getName() +
                                    " -> "+ this.myContact.get(i).getPhoneNumber());
        }
    }
}
