// package com.hackathon.dekofcards;

import java.util.ArrayList;

public class Deck {
  //member variables
  private int randomCardIndex;
  public int player1;
  public int player2;
	
	private ArrayList<Card> cards;
	
    public Deck() {
        this.cards = new ArrayList<Card>();

        // Populate the cards list -- loop to 52
        for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
            for (Integer rank = 1; rank <= 13; rank++) {
                this.cards.add(new Card(name, rank));
            }
        }
    }

  
  public void drawCard(int player){
    this.setRandomCardIndex();
    if(player == 1){
      if(this.getCards().get(this.getRandomCardIndex()).getRank()>10){
        player1 += 10;
      }
      else{
        player1 += this.getCards().get(this.getRandomCardIndex()).getRank();
      }
    }
    else if(player == 2){
      if(this.getCards().get(this.getRandomCardIndex()).getRank()>10){
        player2 += 10;
      }
      else{
        player2 += this.getCards().get(this.getRandomCardIndex()).getRank();
      }
    }
    
    this.getCards().get(this.getRandomCardIndex()).showCard();
  }

  // getters and setters
  public void setRandomCardIndex(){
    randomCardIndex = (int)(Math.random() * 52);
  }

  public int getRandomCardIndex(){
    return this.randomCardIndex;
  }
  
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
  
}