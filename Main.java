package assignment4;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		CardPlayer player = new CardPlayer("Tyler");
		for (int i = 0; i < 5; i++) {
			player.getCard(deck.deal());
		}
		System.out.println(player.showCards());
	}

}
