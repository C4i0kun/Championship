package championship;

public class Team {
	private String name;
	private String goalsDifference;
	private String totalPoints;
	private String goalsFor;
	
	/* Constructor */
	
	public Team(String name) {
		this.setName(name);
	}

	/* Getters and Setters */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoalsDifference() {
		return goalsDifference;
	}

	public void setGoalsDifference(String goalsDifference) {
		this.goalsDifference = goalsDifference;
	}

	public String getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(String goalsFor) {
		this.goalsFor = goalsFor;
	}
	
	
}
