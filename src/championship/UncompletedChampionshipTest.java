/*
 * Caio de Souza Barbosa Costa - NUSP: 11257734
 * Lucas Rodrigues Cupertino Cardoso - NUSP: 11257543
 * 
 */

package championship;

import org.junit.jupiter.api.Test;

class UncompletedChampionshipTest {

	@Test
	void test() {
		Team teamA = new Team("A");
		Team teamB = new Team("B");
		Team teamC = new Team("C");
		Team teamD = new Team("D");
		Team teamE = new Team("E");
		
		Calendar calendar = new Calendar(new Date(16, 3, 2020));
		calendar.addNewGame(new Date(2, 3, 2020), teamA, teamB);
		calendar.addNewGame(new Date(3, 3, 2020), teamA, teamC);
		calendar.addNewGame(new Date(4, 3, 2020), teamA, teamD);
		calendar.addNewGame(new Date(5, 3, 2020), teamA, teamE);
		calendar.addNewGame(new Date(6, 3, 2020), teamB, teamC);
		calendar.addNewGame(new Date(7, 3, 2020), teamB, teamD);
		calendar.addNewGame(new Date(8, 3, 2020), teamB, teamE);
		calendar.addNewGame(new Date(9, 3, 2020), teamC, teamD);
		calendar.addNewGame(new Date(10, 3, 2020), teamC, teamE);
		calendar.addNewGame(new Date(11, 3, 2020), teamD, teamE);
		
		calendar.addNewGame(new Date(15, 3, 2020), teamE, teamD);
		calendar.addNewGame(new Date(16, 3, 2020), teamE, teamC);
		calendar.addNewGame(new Date(17, 3, 2020), teamD, teamC);
		calendar.addNewGame(new Date(18, 3, 2020), teamE, teamB);
		calendar.addNewGame(new Date(19, 3, 2020), teamD, teamB);
		calendar.addNewGame(new Date(20, 3, 2020), teamC, teamB);
		calendar.addNewGame(new Date(21, 3, 2020), teamE, teamA);
		calendar.addNewGame(new Date(22, 3, 2020), teamD, teamA);
		calendar.addNewGame(new Date(23, 3, 2020), teamC, teamA);
		calendar.addNewGame(new Date(24, 3, 2020), teamB, teamA);
		
		
		Counter counter = new Counter(calendar);
		counter.calculateTeamStats();
		counter.printChampionshipTable();
	}

}
