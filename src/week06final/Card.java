package week06final;

public class Card {

	public static final int Two = 2;
	public static final int Three = 3;
	public static final int Four = 4;
	public static final int Five = 5;
	public static final int Six = 6;
	public static final int Seven = 7;
	public static final int Eight = 8;
	public static final int Nine = 9;
	public static final int Ten = 10;
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;
	public static final int Ace = 14;
	
	public static final int Clubs = 0;
	public static final int Diamonds = 1;
	public static final int Hearts = 2;
	public static final int Spades = 3;
	
	private int cardName;
	private int cardValue;
	
	public Card (int cardName, int cardValue) {
		this.setCardName(cardName);
		this.setCardValue(cardValue);
	}
	private void setCardName (int newCardName) {
		if(newCardName >= 0 && newCardName <=3) {
			this.cardName = newCardName;
		}
	}
	private void setCardValue (int newCardValue) {
		if(newCardValue < 2 || newCardValue > 14) {
		}	
			this.cardValue = newCardValue;
		}
		public int getcardName() {
			return cardName;
		}
		public int getValue() {
			return cardValue;
		}
public String toString() {
	String rankString;
	switch(cardValue) {
	case 2 -> rankString = "2";
	case 3 -> rankString = "3";
	case 4 -> rankString = "4";
	case 5 -> rankString = "5";
	case 6 -> rankString = "6";
	case 7 -> rankString = "7";
	case 8 -> rankString = "8";
	case 9 -> rankString = "9";
	case 10 -> rankString = "10";
	case Jack -> rankString = "Jack";
	case Queen -> rankString = "Queen";
	case King -> rankString = "King";
	case Ace -> rankString = "Ace";
	default -> rankString = String.valueOf(cardValue);
	}

	String suitString;
	switch (cardName) {
	case Clubs -> suitString = " Clubs";
	case Diamonds -> suitString = " Diamonds";
	case Hearts -> suitString = " Hearts";
	case Spades -> suitString = " Spades";
	default -> suitString = "Unkown Suit";
	}
	return rankString + " of" + suitString; //concatenation here 
}

public void describe() {
	System.out.println(this.toString() + "\n"); //new line character 
}
		
} //Main, Work on Deck tomorrow
	
	
	
	
	

