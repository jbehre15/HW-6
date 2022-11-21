package Classes;

public class Game_Chair {
	
	public void startGame() {
		Main.Computer.Start();
		Main.Player2.Start();
		Player Winner = Main.Bet.FindWinner(Main.Computer, Main.Player2);
		Player Loser = null;
		if(Winner == Main.Computer) {
			Loser = Main.Player2;
		} else {
			Loser = Main.Computer;
		}
		System.out.println(Winner.getName() + " gewinnt mit " + Winner.getCard() + " gegen " + Loser.getCard());
		
	}
	
}
