/*
 * Caio de Souza Barbosa Costa - NUSP: 11257734
 * Lucas Rodrigues Cupertino Cardoso - NUSP: 11257543
 * 
 */

package championship;

public class Game {
	private boolean played;
	private Date date;
	private Team firstTeam;
	private Team secondTeam;
	private int firstTeamGoals;
	private int secondTeamGoals;
	
	/* Constructor */
	
	public Game(Date date, Team firstTeam, Team secondTeam) {
		this.date = date;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		
		this.played = false;
		this.firstTeamGoals = 0;
		this.secondTeamGoals = 0;
	}
	
	/* Getters and Setters */

	public boolean wasPlayed() {
		return played;
	}

	public void setPlayed(boolean played) {
		this.played = played;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Team getFirstTeam() {
		return firstTeam;
	}

	public void setFirstTeam(Team firstTeam) {
		this.firstTeam = firstTeam;
	}

	public Team getSecondTeam() {
		return secondTeam;
	}

	public void setSecondTeam(Team secondTeam) {
		this.secondTeam = secondTeam;
	}

	public int getFirstTeamGoals() {
		return firstTeamGoals;
	}

	public void setFirstTeamGoals(int firstTeamGoals) {
		this.firstTeamGoals = firstTeamGoals;
	}

	public int getSecondTeamGoals() {
		return secondTeamGoals;
	}

	public void setSecondTeamGoals(int secondTeamGoals) {
		this.secondTeamGoals = secondTeamGoals;
	}
	
	
}
