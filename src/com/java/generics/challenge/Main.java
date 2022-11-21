package com.java.generics.challenge;

import com.java.generics.BaseballPlayer;
import com.java.generics.FootballPlayer;
import com.java.generics.SoccerPlayer;
import com.java.generics.Team;

public class Main {
    public static void main(String[] args){
        League<Team<FootballPlayer>> footballLeague = new League<>("Foot Ball League");
        Team<FootballPlayer>  juventus = new Team<>("Juventus");
        Team<FootballPlayer>  fcBarcelona = new Team<>("FC Barcelona");
        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
        juventus.matchResult(fcBarcelona,5,2);
        fcBarcelona.matchResult(liverpool,1,3);
        liverpool.matchResult(juventus,1,3);
        footballLeague.add(juventus);
        footballLeague.add(fcBarcelona);
        footballLeague.add(liverpool);
        footballLeague.showLeagueTable();
        FootballPlayer messi = new FootballPlayer("Messi");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
        Team rawTeam = new Team("Raw team");
        rawTeam.addPlayer(messi);
        rawTeam.addPlayer(ronaldo);
//
//        footballLeague.add(rawTeam);
//
//        League<FootballPlayer,Team<FootballPlayer>> rawLeague = new League<>()

    }
}
