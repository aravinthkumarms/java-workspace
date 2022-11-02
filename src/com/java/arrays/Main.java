package com.java.arrays;

import java.util.Scanner;

public class Main {
    static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args){
        int []  myArray = new int[10];
      //datatype                      array length
        System.out.print("Enter the array length:");
        int [] myIntArray = getIntegers(scanner.nextInt());
        printArray(myIntArray);
        System.out.println("Sorted Array :");
        printArray(sortArray(myIntArray));
        printArray(reverse(myIntArray));
    }

    public static int[] sortArray(int[] array){
            for(int i=0;i<array.length-1;i++){
                for (int j = 0; j < array.length - i - 1; j++)
                    if (array[j] < array[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
            }
        return array;
    }


    public static int[] getIntegers(int elements){
        int[] newArray = new int[elements];
        for(int i=0;i<elements;i++){
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void  printArray(int[] array){
        for(int i =0; i<array.length;i++){
            System.out.println("Array element "+array[i]+" at "+i+" position");
        }
    }

    public static int[] reverse(int[] array){
        int maxLength = array.length -1;
        int halfLength = array.length /2;
        for(int i=0;i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxLength - i];
            array[maxLength -i] = temp;
        }
        return array;
    }
}
