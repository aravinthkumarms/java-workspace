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
        if(findContact(contact.getName()) >=0){
            System.out.println("Contact is already exists");
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
        this.myContact.set(foundPosition,newContact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0;i<this.myContact.size();i++){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName));
                return i;
        }
        return -1;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition >0 ){
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
}
