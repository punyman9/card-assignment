package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards;
	
	public static final int NUM_RANKS = 13;
	
	public Deck() {
		cards = new ArrayList<Card>();
		for (Suit suit : Suit.values()) {
			for (int rank = 1; rank <= NUM_RANKS; rank++) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void shuffle() {
		// Is this cheating?
		Collections.shuffle(cards);
	}
	
	public Card deal() {
		if (cards.size() >= 1) {
			return cards.remove(0);
		} else {
			// Exceptions?
			return null;
		}
	}
	
	public boolean isOrdered() {
		//TODO: redo this - there's got to be an easier/more graceful way
		int currentCardIndex = 0;
		for (Suit suit : Suit.values()) {
			for (int rank = 1; rank <= NUM_RANKS; rank++) {
				if (!cards.get(currentCardIndex).equals(new Card(suit, rank))) {
					return false;
				}
				currentCardIndex++;
				if (currentCardIndex > cards.size()) {
					break;
				}
			}
		}
		return true;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();		
		sb.append(String.format("There are %d cards in this deck. \n", cards.size()));		
		for (Card card : cards) {
			sb.append(card.toString() + "\n");
		}
		
		return sb.toString();
	}

}
