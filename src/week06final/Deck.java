package week06final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<Card>();

public void shuffle() {
	Collections.shuffle(deck);
}
	
public Card playCard() {
	Card playedCard = this.deck.get(0);
	this.deck.remove(0);
	return playedCard;
}
	public Deck() {
		for (int k = 2; k <= 14; k++) {
			for (int i = 0; i < 4; i++) {
				deck.add(new Card(i,k));
			}
		}
	}
public List<Card> getCards(){
	return deck;
}
public void setCards(List<Card> deck) {
	this.deck = deck;
}
	
public Card draw() {
	if (deck.isEmpty()) {
		System.out.println("No more cards");
		return null;
	} else {
		Card drawnTopCard = deck.get(0);
		deck.remove(0);
		return drawnTopCard;
	}
}

}
