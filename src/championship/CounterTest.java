package championship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CounterTest {
	static Team teamA = new Team("teamA");
	static Team teamB = new Team("teamB");
	static Team teamC = new Team("teamC");
	
	static Calendar calendar = new Calendar(new Date(10, 10, 2020));
	static Counter counter = new Counter(calendar);
	
	@BeforeAll
	static void preparation() {
		calendar.addNewGame(new Date(1, 1, 2020), teamA, teamB);
		calendar.addNewGame(new Date(2, 1, 2020), teamA, teamC);
		calendar.addNewGame(new Date(3, 1, 2020), teamB, teamC);
		
		counter.calculateTeamStats();
		
	}

	@Test
	void testlistOfTeams() {
		boolean testpassed = true;
		
		if (testpassed == true) {
			testpassed = counter.listOfTeams.contains(teamA);
		}
		
		if (testpassed == true) {
			testpassed = counter.listOfTeams.contains(teamB);
		}

		if (testpassed == true) {
			testpassed = counter.listOfTeams.contains(teamC);
		}
		
		assertEquals(true, testpassed);
	}
	
	/* We are not going to do a test to know if the final classification makes sense because a ranking is
	 * printed in the end of the execution, it doesn't make sense to lose time doing something the program itself
	 * provides data to manually test */
	

}
