package Classes;

public class Player {
	
	private String name;
	private int card;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}
	
	public void Start() {
		if(this.name == "Computer") {
			int x = Main.Bet.Play();
			setCard(x);
		} else {
			int i = 0;
			boolean user_selected = false;
			do {
				int x = Main.Bet.Play();
				setCard(x);
				i++;
				boolean received_awnser = false;
				System.out.println("Die gezogene Karte ist " + this.card);
				while(received_awnser == false){
					String awnser = Main.in.nextLine();
					if(awnser.equals("Ja") || awnser.equals("ja")) {
						user_selected = true;
						received_awnser = true;
					} else if(awnser.equals("Nein") || awnser.equals("nein")) {
						received_awnser = true;
					} else {
						System.out.println("Antwort neu eingeben");
					}
				}
			}while(this.name != "Computer" && i<=5 && user_selected == false);
		}
	}
}
