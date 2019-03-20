package improvedWithEnum;
/**
 * An object of type Card represents a playing card from a
 * standard Poker deck, including Jokers.  The card has a suit, which
 * can be spades, hearts, diamonds, clubs, or joker.  A spade, heart,
 * diamond, or club has one of the 13 values: ace, 2, 3, 4, 5, 6, 7,
 * 8, 9, 10, jack, queen, or king.  Note that "ace" is considered to be
 * the smallest value.  A joker can also have an associated value; 
 * this value can be anything and can be used to keep track of several
 * different jokers.
 */
public class Card {

    /**
     * This card's suit, one of the constants SPADES, HEARTS, DIAMONDS,
     * CLUBS, or JOKER.  The suit cannot be changed after the card is
     * constructed.
     */
    private final Suit suit; 

    /**
     * The card's value.  For a normal card, this is one of the values
     * 1 through 13, with 1 representing ACE.  For a JOKER, the value
     * can be anything.  The value cannot be changed after the card
     * is constructed.
     */
    private final CardValue value;

    /**
     * Creates a Joker, with 1 as the associated value.  (Note that
     * "new Card()" is equivalent to "new Card(1,Card.JOKER)".)
     */
    public Card() {
        suit = Suit.JOKER;
        value = CardValue.ACE;
    }

    /**
     * Creates a card with a specified suit and value.
     * @param theValue the value of the new card.  For a regular card (non-joker),
     * the value must be in the range 1 through 13, with 1 representing an Ace.
     * You can use the constants Card.ACE, Card.JACK, Card.QUEEN, and Card.KING.  
     * For a Joker, the value can be anything.
     * @param theSuit the suit of the new card.  This must be one of the values
     * Card.SPADES, Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER.
     * @throws IllegalArgumentException if the parameter values are not in the
     * permissible ranges
     */
    public Card(CardValue theValue, Suit theSuit) {
        value = theValue;
        suit = theSuit;
    }

    /**
     * Returns the suit of this card.
     * @returns the suit, which is one of the constants Card.SPADES, 
     * Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Returns the value of this card.
     * @return the value, which is one of the numbers 1 through 13, inclusive for
     * a regular card, and which can be any value for a Joker.
     */
    public int getValue() {
        return value.ordinal() + 1;
    }

    /**
     * Returns a String representation of the card's suit.
     * @return one of the strings "Spades", "Hearts", "Diamonds", "Clubs"
     * or "Joker".
     */
    public String getSuitAsString() {
        switch ( suit ) {
        case SPADES:   return "Spades";
        case HEARTS:   return "Hearts";
        case DIAMONDS: return "Diamonds";
        case CLUBS:    return "Clubs";
        default:       return "Joker";
        }
    }

    /**
     * Returns a String representation of the card's value.
     * @return for a regular card, one of the strings "Ace", "2",
     * "3", ..., "10", "Jack", "Queen", or "King".  For a Joker, the 
     * string is always numerical.
     */
    public String getValueAsString() {
        if (suit == Suit.JOKER)
            return "" + value;
        else {
            switch ( value ) {
            case ACE:   return "Ace";
            case TWO:   return "2";
            case THREE:   return "3";
            case FOUR:   return "4";
            case FIVE:   return "5";
            case SIX:   return "6";
            case SEVEN:   return "7";
            case EIGHT:   return "8";
            case NINE:   return "9";
            case TEN:  return "10";
            case JACK:  return "Jack";
            case QUEEN:  return "Queen";
            default:  return "King";
            }
        }
    }

    /**
     * Returns a string representation of this card, including both
     * its suit and its value (except that for a Joker with value 1,
     * the return value is just "Joker").  Sample return values
     * are: "Queen of Hearts", "10 of Diamonds", "Ace of Spades",
     * "Joker", "Joker #2"
     */
    public String toString() {
        if (suit == Suit.JOKER) {
            if (value == CardValue.ACE)
                return "Joker";
            else
                return "Joker #" + value;
        }
        else
            return getValueAsString() + " of " + getSuitAsString();
    }


} // end class Card
