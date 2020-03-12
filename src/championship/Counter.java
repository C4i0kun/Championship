/*
 * Caio de Souza Barbosa Costa - NUSP: 11257734
 * Lucas Rodrigues Cupertino Cardoso - NUSP: 11257543
 * 
 */

package championship;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Counter {
	private Calendar calendar;
	private boolean championshipEnded = true;
	ArrayList<Team> listOfTeams;
	
	
	/* Constructor */
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
			Game currentGame = iterator.next();
			Team firstTeam = currentGame.getFirstTeam();
			Team secondTeam = currentGame.getSecondTeam();
			
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
	
	public int getNumberOfTeams() {
		return listOfTeams.size();
	}
	
	
	/* General Functions */
	public void calculateTeamStats() {
		this.createListOfTeams();
		
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
			} else {
				championshipEnded = false;
			}
		}
	}
	
	public void printChampionshipTable() {
		Collections.sort(listOfTeams);
		Iterator<Team> iterator = listOfTeams.iterator();
		
		System.out.println("Time | Total de Pontos | Saldo de Gols | Gols Pró | Jogos Jogados");
		
		while(iterator.hasNext()) {
			Team currentTeam = iterator.next();
			System.out.println("  " + currentTeam.getName() + "  |        " + String.format("%02d", currentTeam.getTotalPoints()) + "       |      " + String.format("%03d", currentTeam.getGoalsDifference()) + "      |    " + String.format("%03d", currentTeam.getGoalsFor()) + "   |      " + String.format("%02d", currentTeam.getGamesPlayed()));
		}
		
		if (championshipEnded == true) {
			System.out.println("\nO vencedor é o time " + this.listOfTeams.get(0).getName() + "!");
		} else {
			System.out.println("\nO campeonato ainda está ocorrendo, portanto, ainda não há um vencedor!");
		}
		
	}
}
