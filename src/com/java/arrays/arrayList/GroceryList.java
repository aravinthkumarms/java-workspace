package com.java.arrays.arrayList;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size() + "items in your grocery List");
        for(int i=0;i< groceryList.size();i++){
            System.out.println((i+1) + " - " +groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery Item "+ groceryList.get(position));
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }
}
