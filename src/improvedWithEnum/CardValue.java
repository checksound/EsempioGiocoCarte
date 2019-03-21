package improvedWithEnum;

import java.util.HashMap;
import java.util.Map;

public enum CardValue {
	
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	
	private static Map<Integer, CardValue> mapping = new HashMap<>();
	
	static {
		for(CardValue cV: CardValue.values()) {
			mapping.put(new Integer(cV.ordinal() + 1), cV);
		}
	}
	
	public static CardValue valueOf(int value) {
		
		return mapping.get(new Integer(value));
	}
}
