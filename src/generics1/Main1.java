package generics1;

import java.util.ArrayList;

import generics.BaseballPlayer;
import generics.FootballPlayer;
import generics.SoccerPlayer;
import generics.Team;

public class Main1 {

	public static void main(String[] args) {

		League1<Team1 <FootballPlayer1>> footballLeague = new League1<>("AFL");
		Team1 <FootballPlayer1>adelaideCrows = new Team1("Adelaide Crows");
		Team1<FootballPlayer1> melburne = new Team1<>("Melbourne");
		Team1<FootballPlayer1> hawthorn = new Team1<>("Hawthorn");
		Team1<FootballPlayer1> hawthorn1 = new Team1<>("Hawthorn1");
		Team1<FootballPlayer1> fremantle = new Team1<>("Fremantle");
		Team1<BaseballPlayer1>baseballTeam = new Team1<>("Chacago Cubs");
		
		hawthorn.matchResult(fremantle,1,0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		
		adelaideCrows.matchResult(fremantle,2,1);
		
		footballLeague.add(adelaideCrows);
		footballLeague.add(melburne);
		footballLeague.add(hawthorn);
		footballLeague.add(fremantle);
		
		//footballLeague.add(baseballTeam);
		footballLeague.showLeagueTable();
		

		
	}
}
