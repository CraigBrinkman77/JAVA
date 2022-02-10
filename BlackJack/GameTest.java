import java.util.ArrayList;

public class Game{

  // call on classes and functions
  public static void main(String[] args) {
    
    Deck myDeck = new Deck();
    ArrayList<Card> cards = myDeck.getCards();
      
    
	  // myDeck.setRandomCardIndex();
  //   System.out.println(myDeck.getRandomCardIndex());
  //   myDeck.getCards().get(myDeck.getRandomCardIndex()).showCard();

		// for (Card card: cards) {
  //       card.showCard();
  //     }
  
    // Have 2 variables = players.

    //myDeck.getPlayer1() 
    
    System.out.println("Player One, Your cards are:");
    myDeck.drawCard(1);
    myDeck.drawCard(1);

    System.out.println("Player One, Your total is:");
    System.out.println(myDeck.player1);

    System.out.println("Player Two, Your cards are:");
    myDeck.drawCard(2);
    myDeck.drawCard(2);

    System.out.println("Player two, Your total is:");
    System.out.println(myDeck.player2);

    System.out.println("Player1 would you like to hit? Y/N \n");
    
    String player1hit1 = System.console().readLine();

    if(player1hit1.equals("Y")){
      System.out.println("Your card is:");
      myDeck.drawCard(1);
      System.out.println("Player 1, Your total is:");
      System.out.println(myDeck.player1);
      if(myDeck.player1 > 21){
      System.out.println("You Busted");
      }else if (myDeck.player1 == 21){
      System.out.println("BINGO!");
      }
      
    }else{
      System.out.println("PLayer 1, Your final total is:");
      System.out.println(myDeck.player1);
    }

    System.out.println("Player2 would you like to hit? Y/N \n");
      String player2hit1 = System.console().readLine();

    if(player2hit1.equals("Y")){
      System.out.println("Your card is:");
      myDeck.drawCard(2);
      System.out.println("Player 2, Your total is:");
      System.out.println(myDeck.player2);
      if(myDeck.player2 > 21){
      System.out.println("You Busted");
      }else if (myDeck.player2 == 21){
      System.out.println("BINGO!");
      }
    }else{
      System.out.println("Player 2, Your final total is:");
      System.out.println(myDeck.player2);
    }


    
    // Players can recieve cards with values that adds to total
    // players recieve 2 cards at start
    // players can choose to hit = new random card
    // check if bust
    // players can choose to stay next player
    // check if both stay. announce winner
    // announce by finding difference between 21 and total
    // if a player busts reset game and other player wins
		
    
	}
}