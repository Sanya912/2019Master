package generics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");
	
	Team <FootballPlayer>adelaideCrows = new Team("Adelaide Crows");
	adelaideCrows.addPlayer(joe);
/*	adelaidecrows.addPlayer(pat);
	adelaidecrows.addPlayer(beckham);*/
	
	System.out.println(adelaideCrows.numPlayes());
	
	Team<BaseballPlayer>baseballTeam = new Team<>("Chacago");
	baseballTeam.addPlayer(pat);	
	
	Team<SoccerPlayer>brokenTeam  = new Team<>("this won't work");
	brokenTeam.addPlayer(beckham);
	

	Team<FootballPlayer> melburne = new Team<>("Melbourne");
	FootballPlayer banks = new FootballPlayer("Gordon");
	melburne.addPlayer(banks);
	
	Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
	Team<FootballPlayer> fremantle = new Team<>("Fremantle");
	
	hawthorn.matchResult(fremantle,1,0);
	hawthorn.matchResult(adelaideCrows, 3, 8);
	
	adelaideCrows.matchResult(fremantle,2,1);
	//adelaideCrows.matchResult(baseballTeam,1,1);
	
	System.out.println("Ranking");
	System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
	System.out.println(melburne.getName() + ": " + melburne.ranking());
	System.out.println(fremantle.getName() + ": " + fremantle.ranking());
	System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
	
	System.out.println(adelaideCrows.compareTo(melburne));
	System.out.println(adelaideCrows.compareTo(hawthorn));
	System.out.println(hawthorn.compareTo(adelaideCrows));
	System.out.println(melburne.compareTo(fremantle));
	
	
	}
}
