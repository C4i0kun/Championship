package championship;

public class Game {
	private boolean played;
	private Date date;
	private Team firstTeam;
	private Team secondTeam;
	private int firstTeamGoals;
	private int secontTeamGoals;
	
	/* Constructor */
	
	public Game(Date date, Date today, Team firstTeam, Team secondTeam) {
		this.setDate(date);
		this.setFirstTeam(firstTeam);
		this.setSecondTeam(secondTeam);
		
		this.played = Date.datePassed(date, today);
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

	public int getSecontTeamGoals() {
		return secontTeamGoals;
	}

	public void setSecontTeamGoals(int secontTeamGoals) {
		this.secontTeamGoals = secontTeamGoals;
	}
	
	
}
