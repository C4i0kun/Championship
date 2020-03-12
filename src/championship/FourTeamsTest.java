/*
 * Caio de Souza Barbosa Costa - NUSP: 11257734
 * Lucas Rodrigues Cupertino Cardoso - NUSP: 11257543
 * 
 */

package championship;

import org.junit.jupiter.api.Test;

/*
 * Test with four teams in a completed championship
 */

class FourTeamsTest {

	@Test
	void fourTeamsTest() {
		Team teamA = new Team("A");
		Team teamB = new Team("B");
		Team teamC = new Team("C");
		Team teamD = new Team("D");
		
		Calendar calendar = new Calendar(new Date(20, 3, 2020));
		calendar.addNewGame(new Date(2, 3, 2020), teamA, teamB);
		calendar.addNewGame(new Date(3, 3, 2020), teamA, teamC);
		calendar.addNewGame(new Date(4, 3, 2020), teamA, teamD);
		calendar.addNewGame(new Date(5, 3, 2020), teamB, teamC);
		calendar.addNewGame(new Date(6, 3, 2020), teamB, teamD);
		calendar.addNewGame(new Date(7, 3, 2020), teamC, teamD);
		
		calendar.addNewGame(new Date(11, 3, 2020), teamD, teamC);
		calendar.addNewGame(new Date(12, 3, 2020), teamD, teamB);
		calendar.addNewGame(new Date(13, 3, 2020), teamC, teamB);
		calendar.addNewGame(new Date(14, 3, 2020), teamD, teamA);
		calendar.addNewGame(new Date(15, 3, 2020), teamC, teamA);
		calendar.addNewGame(new Date(16, 3, 2020), teamB, teamA);
		
		Counter counter = new Counter(calendar);
		counter.calculateTeamStats();
		counter.printChampionshipTable();
	}

}
