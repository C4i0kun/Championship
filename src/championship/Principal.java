package championship;

public class Principal {

	public static void main(String[] args) {
		Team teamA = new Team("A");
		Team teamB = new Team("B");
		Team teamC = new Team("C");
		
		Date firstDate = new Date(2, 3, 2020);
		Date secondDate = new Date(9, 3, 2020);
		Date thirdDate = new Date(13, 3, 2020);
		
		Date today = new Date(15, 3, 2020);
		
		Calendar calendar = new Calendar(today);
		calendar.addNewGame(firstDate, teamA, teamB);
		calendar.addNewGame(secondDate, teamA, teamC);
		calendar.addNewGame(thirdDate, teamB, teamC);
		
		
		Counter counter = new Counter(calendar);
		counter.calculateTeamStats();
		counter.printChampionshipTable();

	}

}
