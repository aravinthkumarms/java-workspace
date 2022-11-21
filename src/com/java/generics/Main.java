package com.java.generics;

public class Main {
    public static void main(String[] args){
        FootballPlayer messi = new FootballPlayer("Messi");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(messi);
        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago cubs");
        chicagoCubs.addPlayer(pat);
        Team<SoccerPlayer>  juventus = new Team<>("Juventus");
        juventus.addPlayer(ronaldo);
        Team<SoccerPlayer>  fcBarcelona = new Team<>("FC Barcelona");
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        juventus.matchResult(fcBarcelona,5,2);
        fcBarcelona.matchResult(liverpool,1,3);
        System.out.println(juventus.ranking());
        System.out.println(fcBarcelona.ranking());
        System.out.println(liverpool.ranking());
        System.out.println(juventus.compareTo(fcBarcelona));
        System.out.println(juventus.compareTo(liverpool));
        System.out.println(fcBarcelona.compareTo(juventus));
        System.out.println(liverpool.compareTo(juventus));
    }
}
