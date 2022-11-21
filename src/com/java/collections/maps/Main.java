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
        languages.put("Python", "an interpreted, oo  high level programming language");
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

        for(String key:languages.keySet()){
            System.out.println(key +" : " +languages.get(key));
        }
    }
}
