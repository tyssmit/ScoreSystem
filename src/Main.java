import controller.Scoreboard;
import model.Balloon;
import model.Clown;
import model.SquareBalloon;

public class Main {

	public static void main(String[] args) {
		Scoreboard scoreboard = new Scoreboard();
		System.out.println("Balloon Tap Score: ");
		scoreboard.algoBase = new Balloon();
		scoreboard.showScore(10, 5);
		
		System.out.println("Clown Tap Score: ");
		scoreboard.algoBase = new Clown();
		scoreboard.showScore(10, 5);
		
		System.out.println("Square balloon score: ");
		scoreboard.algoBase = new SquareBalloon();
		scoreboard.showScore(10, 5);
	}

}
