
public class TestHandNew {
	
	private static void print(HandNew hand) {
		int numCards = hand.getCardCount();
		
		for(int i = 0; i < numCards; i++ ) {
			System.out.println(hand.getCard(i));
		}
	}

	public static void main(String[] args) {
		
		HandNew mano1 = new HandNew();
		
		mano1.addCard(new Card(9, Card.HEARTS));
		mano1.addCard(new Card(7, Card.SPADES));
		mano1.addCard(new Card(Card.ACE, Card.HEARTS));
		mano1.addCard(new Card(8, Card.HEARTS));
		mano1.addCard(new Card(7, Card.CLUBS));
		mano1.addCard(new Card(10, Card.HEARTS));
		mano1.addCard(new Card(7, Card.HEARTS));
		mano1.addCard(new Card(Card.ACE, Card.SPADES));
		
		print(mano1);
		
		System.out.println("SORTING PER SEMI:");
		
		mano1.sortBySuit();
		print(mano1);
		
		System.out.println("SORTING PER VALORE:");
		
		mano1.sortByValue();
		print(mano1);
		
		
	}

}
