# Esempio gioco carte

Un altro esempio di utilizzo dell'algoritmo di **selection sort** per ordinare un mazzo di carte (utilizzando la classe `ArrayList` al posto dell'array). 

In questo caso la carte sono contenute in una lista di tipo `ArrayList<Card>` all'interno della classe `Hand`. La classe `Card` contiene due metodi d'istanza `getSuit()` e `getValue()`. In questo algoritmo di sorting le carte viene creata una nuova lista e le carte sono prese dalla vecchia lista in ordine crescente, e messe nella nuova lista. Alla fina alla variabile `hand`  (che conteneva la vecchia lista di carte non ordinate) viene assegnata la nuova lista con le carte ordinate.

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

Vedi [TestHand](src/base/TestHand.java) per esempio di esecuzione del sorting, per seme e per valore.

In [Deck](src/base/Deck.java), c'è l'algoritmo per eseguire il mescolamento delle carte del mazzo:

```java
/**
 * Put all the used cards back into the deck (if any), and
 * shuffle the deck into a random order.
 */
public void shuffle() {
    for ( int i = deck.length-1; i > 0; i-- ) {
        int rand = (int)(Math.random()*(i+1));
        Card temp = deck[i];
        deck[i] = deck[rand];
        deck[rand] = temp;
    }
    cardsUsed = 0;
}
```

Nell'esecuzione del gioco, vedi classe [HighLow](./src/base/HighLow.java), viene chiesto all'utente di indovinate se la carte seguente pescata dal mazzo, mischiato in modo casuale, sarà maggiore o minore della carta precedente.

---------

La classe  [Hand](src/improved/Hand.java) nel package `improved`, utilizza il metodo `sort()` di `java.util.Collections` per eseguire i diversi tipi di sort `void sortBySuit()` e `void sortByValue()`.

Vedi [TestHand](src/improved/TestHand.java) per esempio di utilizzo.

---------

Nel package `improvedWithEnum` c'è la versione che utilizza `enum` per il valori delle carte e i semi. 

---------

Preso da http://math.hws.edu/javanotes8/

In [Programming Example: Card, Hand, Deck](http://math.hws.edu/javanotes8/c5/s4.html)

Sorgenti http://math.hws.edu/javanotes8/source/index.html