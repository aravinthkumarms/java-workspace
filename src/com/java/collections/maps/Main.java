package com.java.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String,String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else {
            languages.put("Java", "A compiled high level, oo, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, oo high level programming language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "There in lies madness");
//        System.out.println(languages);
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }
        else{
            languages.put("Java","Leaning about java");
        }
        System.out.println("----------------------------------------------------------------");
       // languages.remove("Lisp");
        if(languages.remove("Algol","an algorithmic language")){
            System.out.println("Algol removed,");
        }
        else{
            System.out.println("Algol not removed, key/value pair not found");
        }
        System.out.println(languages.replace("Lisp"," a functional programming language with imperative features"));
        // if the old value matches with key , then only replaced with new value
        if(languages.replace("Lisp"," a functional programming language with imperative features","There in lies madness")){
           System.out.println("Lisp replaced ");
       }else{
           System.out.println("Lisp was not replaced");
       }
        System.out.println(languages.replace("Scala","this will not be added"));
        for(String key:languages.keySet()){
            System.out.println(key +" : " +languages.get(key));
        }
    }
}
