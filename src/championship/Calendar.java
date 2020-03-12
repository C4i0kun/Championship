/*
 * Caio de Souza Barbosa Costa - NUSP: 11257734
 * Lucas Rodrigues Cupertino Cardoso - NUSP: 11257543
 * 
 */

package championship;

import java.util.ArrayList;
import java.util.Random;

public class Calendar {
	private Date currentDay;
	ArrayList<Game> listOfGames;
	
	public Calendar(Date currentDay) {
		this.listOfGames = new ArrayList<>();
		this.currentDay = currentDay;
	}

	/* Getters and Setters */
	
	public Date getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(Date currentDay) {
		this.currentDay = currentDay;
	}
	
	public ArrayList<Game> getListOfGames() {
		return this.listOfGames;
	}
	
	/* General functions */
	public void addNewGame(Date date, Team firstTeam, Team secondTeam) {
		Game newGame = new Game(date, firstTeam, secondTeam);
		
		if (Date.datePassed(date, currentDay)) {
			newGame.setPlayed(true);
			
			Random rand = new Random();
			newGame.setFirstTeamGoals(rand.nextInt(10));
			newGame.setSecondTeamGoals(rand.nextInt(10));		
		}
		
		if (!listOfGames.contains(newGame)) {
			listOfGames.add(newGame);
		}
	}
	
	public void removeGame(Game game) {
		listOfGames.remove(game);
	}
	
}
