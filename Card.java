package assignment4;

public class Card {
	private Suit suit;
	private int rank;
	
	public Card(Suit suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	private String getSuitAsString() {
		switch (suit) {
		case SPADES:
			return "Spades";
		case CLUBS:
			return "Clubs";
		case HEARTS:
			return "Hearts";
		case DIAMONDS:
			return "Diamonds";
		default:
			return null;
		}
	}

	private String getRankAsString() {
		switch (rank) {
		case 1:
			return "Ace";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		default:
			return String.valueOf(rank);
				
		}
	}
	
	@Override
	public boolean equals(Object o) {
		Card card = (Card) o;
		return card.suit == this.suit && card.rank == this.rank;
	}
	
	@Override
	public String toString() {
		return  getRankAsString() + " of " + getSuitAsString();
	}

	
}
