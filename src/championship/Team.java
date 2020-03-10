package championship;

public class Team implements Comparable<Team> {
	private String name;
	private int gamesPlayed;
	private int goalsDifference;
	private int totalPoints;
	private int goalsFor;
	
	/* Constructor */
	
	public Team(String name) {
		this.name = name;
		this.gamesPlayed = 0;
		this.goalsDifference = 0;
		this.totalPoints = 0;
		this.goalsFor = 0;
	}

	/* Getters and Setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getGoalsDifference() {
		return goalsDifference;
	}

	public void setGoalsDifference(int goalsDifference) {
		this.goalsDifference = goalsDifference;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public int getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}


	/* General Functions */
	public void addToGoalsFor(int number) {
		this.goalsFor += number;
	}
	
	public void addToGoalsDifference(int number) {
		this.goalsDifference += number;
	}
	
	public void addToTotalPoints(int number) {
		this.totalPoints += number;
	}
	
	public void addGamePlayed() {
		this.gamesPlayed++;
	}

	/* Comparable methods */
	@Override
	public int compareTo(Team anotherTeam) {
		if (this.totalPoints < anotherTeam.totalPoints) {
			return 1;
		} else if (this.totalPoints > anotherTeam.totalPoints) {
			return -1;
		} else {
			if (this.goalsDifference < anotherTeam.goalsDifference) {
				return 1;
			} else if (this.goalsDifference > anotherTeam.goalsDifference) {
				return -1;
			} else {
				if (this.goalsFor < anotherTeam.goalsFor) {
					return 1;
				} else if (this.goalsFor > anotherTeam.goalsFor) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
}
