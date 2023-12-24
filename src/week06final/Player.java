package week06final;

import java.util.ArrayList;
import java.util.List;

public class Player {

List<Card> hand = new ArrayList<Card>();
int score;
String name;

public Player (String name) {
	this.name = name;
	this.score = 0;
}

public void describe() {
	System.out.println(name + " has the following cards:");
	System.out.println("");
	for (Card card : hand) {
	card.describe();
	}
	System.out.println("----------");
}	

public Card flip() {
	Card drawnTopCard = hand.get(0);
	hand.remove(0);
	return drawnTopCard;
}

public void draw(Deck deck) {
	Card card = deck.draw();
	hand.add(card);
}

public void incrementScore() {
	this.score++;
}
public int getScore() {
	return score;
}

	
}//Main End
