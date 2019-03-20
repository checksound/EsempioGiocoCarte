package improvedWithEnum;

public class TestHand {
	
	private static void print(Hand hand) {
		int numCards = hand.getCardCount();
		
		for(int i = 0; i < numCards; i++ ) {
			System.out.println(hand.getCard(i));
		}
	}

	public static void main(String[] args) {
		
		Hand mano1 = new Hand();
		
		mano1.addCard(new Card(CardValue.NINE, Suit.HEARTS));
		mano1.addCard(new Card(CardValue.SEVEN, Suit.SPADES));
		mano1.addCard(new Card(CardValue.ACE, Suit.HEARTS));
		mano1.addCard(new Card(CardValue.EIGHT, Suit.HEARTS));
		mano1.addCard(new Card(CardValue.SEVEN, Suit.CLUBS));
		mano1.addCard(new Card(CardValue.TEN, Suit.HEARTS));
		mano1.addCard(new Card(CardValue.SEVEN, Suit.HEARTS));
		mano1.addCard(new Card(CardValue.ACE, Suit.SPADES));
		
		print(mano1);
		
		System.out.println("SORTING PER SEMI:");
		
		mano1.sortBySuit();
		print(mano1);
		
		System.out.println("SORTING PER VALORE:");
		
		mano1.sortByValue();
		print(mano1);
		
		
	}

}
