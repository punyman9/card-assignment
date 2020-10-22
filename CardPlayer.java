package assignment4;

import java.util.ArrayList;

public class CardPlayer {
	
	private String name;
	private ArrayList<Card> hand;
	
	public CardPlayer(String name) {
		this.name = name;
		hand = new ArrayList<Card>();
	}
	
	public Card getCard(Card card) {
		hand.add(card);
		return card;
	}
	
	public String showCards() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s has %d cards:\n", name, hand.size()));
		for (Card card : hand) {
			sb.append(card.toString() + "\n");
		}
		return sb.toString();
	}	
}
