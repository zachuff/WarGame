import java.util.ArrayList;
import java.util.List;

public class Players {
	private List<Cards> hand = new ArrayList<Cards>();
	private int score;
	private String name;
	public Players() {
		score = 0;
	}
	public Players(String newName) {
		name = newName;
		score = 0;
	}
	public void describe() {
		System.out.printf("Player %s has these cards: \n", name);
		for(Cards card : hand) {
			card.describe();
		}
	}
	public Cards flip() {
		return hand.remove(0);
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void incrementScore() {
		score++;
	}
	public int getScore() {
		return score;
	}

}
