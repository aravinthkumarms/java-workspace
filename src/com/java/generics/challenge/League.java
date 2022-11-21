package com.java.generics.challenge;

import com.java.generics.Team;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            System.out.println("Team already added to the league, Not added");
            return false;
        }
        else{
            this.league.add(team);
            System.out.println("Team" + team.getName()+" added to the League "+this.name);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t:league){
            System.out.println(t.getName() +" : "+t.ranking());
        }
    }
}
