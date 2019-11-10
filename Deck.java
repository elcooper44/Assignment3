package com.bham.pij.assignments.pontoon;
import java.util.ArrayList;
public class Deck {
		private  String[] suitArray =  {"HEARTS", "SPADES","CLUBS", "DIAMONDS"};
		private  String[] valueArray = {"TWO", "THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"};
		private ArrayList<Card> startDeck = new ArrayList<Card>();
		public Deck() {
			for (String s: suitArray) {
				for (String v: valueArray) {
					Card c = new Card(s,v);
					startDeck.add(c);
				}
			}
			//int deckSize = startDeck.size();
		}
		public Card getCard(int i) {
			return startDeck.get(i);
		}
		public int getDeckSize() {
			return 52;
		}
		public Card dealCard(int i) {
			if (startDeck.get(i).getDealt()) {
				return null;
			}else { //if(!startDeck.get(i).getDealt()) {
				startDeck.get(i).setDealt(true);
				//deckSize = deckSize - 1;
				return startDeck.get(i);
			}
		}
		public void reset(){
			for (int i = 0 ; i < startDeck.size(); i++) {
				startDeck.get(i).setDealt(false);
			}
		}
			
		
}
