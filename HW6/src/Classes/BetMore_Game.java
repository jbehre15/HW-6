package Classes;

public class BetMore_Game {
	
	public int Play() {
		return Main.s.pick_card();
	}
	
	public Player FindWinner(Player p1, Player p2) {
		if(p1.getCard() > p2.getCard()) {
			return p1;
		} else {
			return p2;
		}
	}
}
