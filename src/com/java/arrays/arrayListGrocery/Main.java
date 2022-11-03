package com.java.arrays.arrayListGrocery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args){
//        groceryList.addGroceryItem("Milk");
//        groceryList.addGroceryItem("Bread");
//        groceryList.printGroceryList();
//        groceryList.modifyGroceryItem(1,"Egg");
//        groceryList.printGroceryList();
//        groceryList.removeGroceryItem(0);
//        groceryList.printGroceryList();

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                   addItem();
                   break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of the grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To print All Items in the List");
        System.out.println("\t 7 - To quit the Application.");
    }

    public static void addItem(){
        System.out.println("Please Enter the grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please Enter Current item name: ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem,newItem);
    }

    public static void removeItem(){
        System.out.println("Please enter item  remove");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.println("Please Enter item to search for: ");
        String itemToSearch = scanner.nextLine();
        if (groceryList.searchItem(itemToSearch)){
            System.out.println("Found " +itemToSearch + "in our grocery List");
        }
        else{
            System.out.println("Item not found");
        }
    }

    public static void processArrayList(){
        ArrayList<String> nextArray = new ArrayList<>();
        nextArray.addAll(groceryList.getGroceryList());

        ArrayList<String> newArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

        System.out.println(newArray);
        System.out.println(nextArray);
        System.out.println(Arrays.stream(myArray).toArray());
    }
}
