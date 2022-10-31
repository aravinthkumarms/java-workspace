package com.java.string;

import com.java.string.isomorphic.Solution;

class Main {
    public static void main(String[] args) {
        printDayOfTheWeek(3);
    }

    public static int calcFeetAndInchesToCentimeters(int feet,int inches){
        if (feet >=0 && inches >=0 && inches <= 12){
            float centimeters = (feet  * 12 * 2.54F) + (inches *2.54F) ;
            System.out.println(centimeters);
            return 1;
        }
        return -1;
    }

    public static int calcFeetAndInchesToCentimeters(int inches){
        if ( inches >=0){
            int feet =  inches *12 ;
            System.out.println(feet);
            return 1;
        }
        return -1;
    }

    public static int secondAndMinutes(int minutes,int seconds){
        if (minutes >=0 || (seconds >=0 && seconds <= 59)){
            int hour= minutes/60;
            int minute = minutes%60;
            System.out.println(hour+"h "+minute+"m "+seconds+"s ");
            return 1;
        }
        return -1;
    }

    public static int secondAndMinutes(int seconds){
        if (seconds >=0){
            int minutes= seconds/60;
            int second = minutes%60;
            secondAndMinutes(minutes,second);
            return 1;
        }
        return -1;
    }

    private static final String INVALID_VALUE ="Invalid Value";
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println(INVALID_VALUE);
            return;
        }
        long year = minutes / 60 * 24;
        long days = minutes /24;
        System.out.println(minutes +" min = "+ year+" y and "+days+" d");
        return;
    }


    public static void printEqual(int first, int second, int third){
        if (first < 0 || second < 0 || third <0){
            System.out.println("Invalid Value");
            return;
        }
        if ((first == second) && (first == third)){
            System.out.println("All numbers are equal");
        }
    }


    public static String switchMethod(String caseType){
        switch (caseType){
            case "Case1":
                System.out.println("Using Case1");
                return caseType;
            case "Case2":
                System.out.println("Using Case2");
                return caseType;
            default:
                System.out.println("Using Default");
                return caseType;
        }
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                return;
            case 1:
                System.out.println("Monday");
                return;
            case 2:
                System.out.println("Tuesday");
                return;
            case 3:
                System.out.println("Wednesday");
                return;
            case 4:
                System.out.println("Thursday");
                return;
            case 5:
                System.out.println("Friday");
                return;
            case 6:
                System.out.println("Saturday");
                return;
            default:
                System.out.println("Invalid Day");
                return;
        }
    }
}