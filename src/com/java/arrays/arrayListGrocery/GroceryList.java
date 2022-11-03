package com.java.arrays.arrayListGrocery;

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

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery Item "+ groceryList.get(position));
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
       return groceryList.indexOf(searchItem);
    }

    public boolean searchItem(String item){
        int position = findItem(item);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
