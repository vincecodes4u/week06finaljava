package week06final;

public class App {

	public static void main(String[] args) {
		Player playerOne = new Player ("Rocky");
		Player playerTwo = new Player ("Apollo");
        Deck deck = new Deck();
        deck.shuffle();
        
        for (int i = 1; i <= 26; i++) {
        	playerOne.hand.add(deck.draw());
        	playerTwo.hand.add(deck.draw());
        }
        playerOne.describe();
        playerTwo.describe();
        
        for (int i = 0; i < 26; i++) {
        	Card playerOneCard = playerOne.flip();
        	Card playerTwoCard = playerTwo.flip();
        	
        if (playerOneCard.getValue() > playerTwoCard.getValue()) {
        	playerOne.incrementScore();
        } else if (playerOneCard.getValue()< playerTwoCard.getValue()) {
        	playerTwo.incrementScore();
        }else{
        	System.out.println();
       }
     }
       if (playerOne.score > playerTwo.score) {
    	   System.out.println("Rocky " + "is the champion!!!");
    	   System.out.println("With a score of " + playerOne.score + " to " + playerTwo.score + ".");
       } else if (playerTwo.score > playerOne.score) {
    	   System.out.println("Apollo " + "is the champion!!!");
    	   System.out.println("With a score of " + playerTwo.score + " to " + playerOne.score + ".");
       } else {
    	   System.out.println("Draw");
       }
        
        
        
        
        
        
        
        
	}//Main

}//Class End
