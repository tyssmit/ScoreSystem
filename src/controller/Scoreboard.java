package controller;

public class Scoreboard {
	public ScoreBoardBase algoBase;
	
	public void showScore(int taps, int multiplier) {
		System.out.println(algoBase.calculateScore(taps, multiplier));
	}
}
