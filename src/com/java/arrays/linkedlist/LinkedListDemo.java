package com.java.arrays.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Alice Spring");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);
//            placesToVisit.add("Sydney");
//            placesToVisit.add("Melbourne");
//            placesToVisit.add("Brisbane");
//            placesToVisit.add("Perth");
//            placesToVisit.add("Canberra");
//            placesToVisit.add("Adelaide");
//            placesToVisit.add("Darwin");
//            printList(placesToVisit);
//            placesToVisit.add(1,"Alice Springs");
//            printList(placesToVisit);
//            placesToVisit.remove(4);
//            printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("-----------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparision = stringListIterator.next().compareTo(newCity);
            if(comparision == 0){
                //equal, do not add
                System.out.println(newCity +" already included as a destination");
                return false;
            }
            else if(comparision > 0){
                //new city should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparision < 0){
                //move on next city

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in iterenary");
        }
        else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday Over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                            goingForward = true;
                        }
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now Visiting " + listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                            goingForward = false;
                        }
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Visiting "+listIterator.previous());
                    }
                    else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions: \npress"+
                                    "\n0 - to quit\n" +
                                    "1 - Go to next city\n"+
                                    "2 - Go to previous city\n"+
                                    "3 - print menu options"
                );
    }
}


