package dylcal13_HW4;

import java.util.*;

public class Box{
	private FlashCard[] cards = new FlashCard[1];

	public Box() {}
	
	public FlashCard[] getCards() {
		return cards;
	}
	public FlashCard getRandomCard() {
		int index = (int) Math.random()*(cards.length);
		return cards[index];
	}
	public void setCards(FlashCard[] cards) {
		this.cards = cards;
	}
	public void addCard(FlashCard card) {
		cards = Arrays.copyOf(cards,cards.length+1);
		cards[cards.length-1]=card;
		cards = Arrays.stream(cards).filter(Objects::nonNull).toArray(FlashCard[]::new);
	}
	public void removeCard(FlashCard card) {
		for (int i=0;i < cards.length;i++) {
			if(cards[i].getQuestion().equals(card.getQuestion()) && cards[i].getAnswer().equals(card.getAnswer())) {
				cards[i]=null;
			}
		}
		cards = Arrays.stream(cards).filter(Objects::nonNull).toArray(FlashCard[]::new);
	}
	
	
	
}