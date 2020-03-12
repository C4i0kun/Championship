package championship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TeamTest {
	static Team teamA = new Team("TeamA");
	static Team teamB = new Team("TeamB");
	
	static Calendar calendar = new Calendar(new Date(3, 3, 2020));
	static Counter counter = new Counter(calendar);
	
	@BeforeAll
	static void preparation() {
		calendar.addNewGame(new Date(2, 2, 220), teamA, teamB);
		counter.calculateTeamStats();
	}

	@Test
	void testTeamInitiation() {
		Team team = new Team("test");
		assertEquals("test", team.getName());
		assertEquals(0, team.getGamesPlayed());
		assertEquals(0, team.getGoalsDifference());
		assertEquals(0, team.getGoalsFor());
		assertEquals(0, team.getTotalPoints());
	}
	

	@Test
	void testTeamGamePlayed() {
		/* Has the teams played the game? */
		assertEquals(1, teamA.getGamesPlayed());
		assertEquals(1, teamB.getGamesPlayed());
	}
	
	@Test
	void testGoalsFor() {
		/* Are the teams' Goals For well calculated? */
		assertEquals(calendar.listOfGames.get(0).getFirstTeamGoals(), teamA.getGoalsFor());
		assertEquals(calendar.listOfGames.get(0).getSecondTeamGoals(), teamB.getGoalsFor());
	}
	
	@Test
	void testGoalsDifference() {
		/* Are the teams' Goals Diffecenre well calculated? */
		assertEquals(calendar.listOfGames.get(0).getFirstTeamGoals() - calendar.listOfGames.get(0).getSecondTeamGoals(), teamA.getGoalsDifference());
		assertEquals(calendar.listOfGames.get(0).getSecondTeamGoals() - calendar.listOfGames.get(0).getFirstTeamGoals(), teamB.getGoalsDifference());
	}
	
	@Test
	void testPointsCalculationTeamA() {
		/* Is teamA receiving its points properly? */
		int receivedPointsA = 0;
		
		if (calendar.listOfGames.get(0).getFirstTeamGoals() - calendar.listOfGames.get(0).getSecondTeamGoals() > 0) {
			receivedPointsA = 3;
		} else if (calendar.listOfGames.get(0).getFirstTeamGoals() - calendar.listOfGames.get(0).getSecondTeamGoals() == 0) {
			receivedPointsA = 1;
		}
		
		assertEquals(receivedPointsA, teamA.getTotalPoints());
	}
	
	@Test
	void testPointsCalculationTeamB() {
		/* Is teamB receiving its points properly? */
		int receivedPointsB = 0;
		
		if (calendar.listOfGames.get(0).getFirstTeamGoals() - calendar.listOfGames.get(0).getSecondTeamGoals() < 0) {
			receivedPointsB = 3;
		} else if (calendar.listOfGames.get(0).getFirstTeamGoals() - calendar.listOfGames.get(0).getSecondTeamGoals() == 0) {
			receivedPointsB = 1;
		}
		
		assertEquals(receivedPointsB, teamB.getTotalPoints());
	}

}
