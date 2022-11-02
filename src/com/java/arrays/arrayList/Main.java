package com.java.arrays.arrayList;

public class Main {
    public static void main(String[] args){
        GroceryList groceryList = new GroceryList();
        groceryList.addGroceryItem("Milk");
        groceryList.addGroceryItem("Bread");
        groceryList.printGroceryList();
        groceryList.modifyGroceryItem(1,"Egg");
        groceryList.printGroceryList();
        groceryList.removeGroceryItem(0);
        groceryList.printGroceryList();
    }
}
