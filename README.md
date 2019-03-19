# Esempio gioco carte

Un altro esempio di utilizzo dell'algoritmo di **selection sort** per ordinare un mazzo di carte (utilizzando la classe ArrayList al posto dell'array). In questo caso la carte sono contenute in una lista di tipo `ArrayList<Card>`. Un oggetto di tipo `Card` contiene due metodi d'istanza `getSuit()` e `getValue()`. In questo algoritmo di sorting le carte viene creata una nuova lista e le carte sono prese dalla vecchia lista in ordine crescente, e messe nella nuova lista. Alla fina alla variabile `hand`  (che conteneva la vecchia lista di carte non ordinate) viene assegnata la nuova lista con le carte ordinate.

```java
/**
 * Sorts the cards in the hand so that cards of the same suit are grouped
 * together, and within a suit the cards are sorted by value. Note that aces are
 * considered to have the lowest value, 1.
 */
public void sortBySuit() {
	ArrayList<Card> newHand = new ArrayList<Card>();
	while (hand.size() > 0) {
		int pos = 0; // Position of minimal card.
		Card c = hand.get(0); // Minimal card.
		for (int i = 1; i < hand.size(); i++) {
			Card c1 = hand.get(i);
			if (c1.getSuit() < c.getSuit() 
				|| (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue())) {
				pos = i; // Update the minimal card and location.
				c = c1;
			}
		}
		hand.remove(pos); // Remove card from original hand.
		newHand.add(c); // Add card to the new hand.
	}
	hand = newHand;
}
```

nella classe [Hand](src/base/Hand.java).

Vedi [TestHand](src/base/TestHand.java) per esempio di utilizzo.

---------

La classe  [Hand](src/improved/Hand.java) nel package `improved`, utilizza il metodo `sort()` di `java.util.Collections`.

Vedi [TestHand](src/improved/TestHand.java) per esempio di utilizzo.

---------

Preso da http://math.hws.edu/javanotes8/

In [Programming Example: Card, Hand, Deck](http://math.hws.edu/javanotes8/c5/s4.html)

Sorgenti http://math.hws.edu/javanotes8/source/index.html