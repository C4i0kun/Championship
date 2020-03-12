package championship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GameTest {
	static Team teamA = new Team("TeamA");
	static Team teamB = new Team("TeamB");
	static Date date = new Date(2, 2, 2020);
	static Calendar calendar = new Calendar(new Date(3, 3, 2020));
	static Counter counter = new Counter(calendar);
	
	@BeforeAll
	static void preparation() {
		calendar.addNewGame(date, teamA, teamB);
		calendar.addNewGame(new Date(4, 4, 2020), teamA, teamB);
		
		counter.calculateTeamStats();
	
	}

	@Test
	void testGameTeams() {
		/* Are the teams registered on the game? */
		assertEquals(calendar.listOfGames.get(0).getFirstTeam(), teamA);
		assertEquals(calendar.listOfGames.get(0).getSecondTeam(), teamB);
	}
	
	@Test
	void testGameDate() {
		/* Is the date right?*/
		assertEquals(calendar.listOfGames.get(0).getDate(), date);
	}
	
	@Test
	void testGamePlayed() {
		/* First Game must've been played */
		assertEquals(true, calendar.listOfGames.get(0).wasPlayed());
	}
	
	@Test
	void testGameUnplayed() {
		/* Second Game must be unplayed */
		assertEquals(false, calendar.listOfGames.get(1).wasPlayed());
	}

}
