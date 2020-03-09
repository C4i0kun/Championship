package championship;

import java.util.ArrayList;
import java.util.Iterator;

public class Counter {
	private Calendar calendar;
	ArrayList<Team> listOfTeams;
	
	public Counter(Calendar calendar) {
		this.calendar = calendar;
		this.createListOfTeams();
		
	}
	
	/* Private functions */
	private void createListOfTeams() {
		this.listOfTeams = new ArrayList<>();
		
		ArrayList<Game> listOfGames = this.calendar.getListOfGames();
		Iterator<Game> iterator = listOfGames.iterator();
		
		while(iterator.hasNext()) {
			Team firstTeam = iterator.next().getFirstTeam();
			Team secondTeam = iterator.next().getSecondTeam();
			
			if (!listOfTeams.contains(firstTeam)) {
				listOfTeams.add(firstTeam);
			}
			
			if (!listOfTeams.contains(secondTeam)) {
				listOfTeams.add(secondTeam);
			}
		}
	}

	/* Getters and Setters */
	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	/* General Functions */
	public void calculateTeamStats() {
		ArrayList<Game> listOfGames = this.calendar.getListOfGames();
		Iterator<Game> iterator = listOfGames.iterator();
		
		while(iterator.hasNext()) {
			Game currentGame = iterator.next();
			Team firstTeam = currentGame.getFirstTeam();
			Team secondTeam = currentGame.getSecondTeam();
			
			if (currentGame.wasPlayed()) {
				firstTeam.addGamePlayed();
				secondTeam.addGamePlayed();
				
				firstTeam.addToGoalsFor(currentGame.getFirstTeamGoals());
				secondTeam.addToGoalsFor(currentGame.getSecondTeamGoals());
			
				firstTeam.addToGoalsDifference(currentGame.getFirstTeamGoals() - currentGame.getSecondTeamGoals());
				secondTeam.addToGoalsDifference(currentGame.getSecondTeamGoals() - currentGame.getFirstTeamGoals());
				
				if (currentGame.getFirstTeamGoals() > currentGame.getSecondTeamGoals()) {
					firstTeam.addToTotalPoints(3);
				} else if (currentGame.getFirstTeamGoals() < currentGame.getSecondTeamGoals()) {
					secondTeam.addToTotalPoints(3);
				} else {
					firstTeam.addToTotalPoints(1);
					secondTeam.addToTotalPoints(1);
				}
			}	
		}
	}
	
	public void printChampionshipTable() {
		Iterator<Team> iterator = listOfTeams.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName() + " | " + iterator.next().getTotalPoints() + " | " + iterator.next().getGamesPlayed());
		}
	}
}
