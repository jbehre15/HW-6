package Classes;

import java.util.Scanner;

public class Main {
	public static Game_Chair chair = new Game_Chair();
	public static Player Computer = new Player ("Computer");
	public static Player Player2 = new Player ("Player2");
	public static BetMore_Game Bet = new BetMore_Game();
	public static Shuffle s = new Shuffle();
	
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
	chair.startGame();
	}
}

