package championship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalendarTest {
	static Date today = new Date(10, 3, 2020);
	
	static Date date1 = new Date(1, 3, 2020);
	static Date date2 = new Date(2, 3, 2020);
	static Date date3 = new Date(3, 3, 2020);
	static Date date4 = new Date(4, 3, 2020);
	static Date date5 = new Date(5, 3, 2020);
	static Date date6 = new Date(6, 3, 2020);
	
	static Calendar calendar = new Calendar(today);
	static Team teamA = new Team("teamA");
	static Team teamB = new Team("teamB");

	@BeforeAll
	static void preparation() {
		calendar.addNewGame(date1, teamA, teamB);
		calendar.addNewGame(date2, teamA, teamB);
		calendar.addNewGame(date3, teamA, teamB);
		calendar.addNewGame(date4, teamA, teamB);
		calendar.addNewGame(date5, teamA, teamB);
		calendar.addNewGame(date6, teamA, teamB);
	}
	
	@Test
	void testCurrentDay() {
		assertEquals(today,calendar.getCurrentDay());
	}
	
	@Test
	void testListOfGamesSize() {
		/* So we can know if all games were added */
		assertEquals(6, calendar.getListOfGames().size());
	}
	
	@Test
	void testAdditionOfGames() {
		/* Compare the date of what was added on listOfGame to check if it makes sens */
		assertEquals(date1, calendar.getListOfGames().get(0).getDate());
		assertEquals(date2, calendar.getListOfGames().get(1).getDate());
		assertEquals(date3, calendar.getListOfGames().get(2).getDate());
		assertEquals(date4, calendar.getListOfGames().get(3).getDate());
		assertEquals(date5, calendar.getListOfGames().get(4).getDate());
		assertEquals(date6, calendar.getListOfGames().get(5).getDate());
	}

}
