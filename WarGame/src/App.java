
public class App {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Players playerOne = new Players("One");
		Players playerTwo = new Players("Two");
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		for(int i = 0; i < 26; i++) {
			Cards playerOneCard = playerOne.flip();
			System.out.print("PlayerOne");
			
			playerOneCard.describe();
			
			Cards playerTwoCard = playerTwo.flip();
			System.out.print("PlayerTwo");
			
			playerTwoCard.describe();
			System.out.println();
			if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				playerOne.incrementScore();
				
				System.out.println("Player One wins the round!");
			} else if (playerTwoCard.getValue() > playerOneCard.getValue()) {
				playerTwo.incrementScore();
				
				System.out.println("Player Two wins the round!");
			} else {
				System.out.println("We have a draw!");
			}
			System.out.println();
			System.out.printf("Player One Score = %d\n", playerOne.getScore());
			System.out.printf("Player Two Score = %d\n", playerTwo.getScore());
			System.out.println();
		}
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Player One wins the game!");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("Player Two wins the game!");
		} else {
			System.out.println("The game ends in a draw!");
		}
	}




}
