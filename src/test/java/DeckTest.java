import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;


    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, ValueType.EIGHT);
    }

    @Test
    public void testDeckHas52Cards(){
        deck.populateDeck();
        assertEquals(52, deck.numberOfCards());
    }



    @Test
    public void testCardIsRemovedFromDeckOnceDealt(){
        deck.populateDeck();
        deck.dealCards();
        assertEquals(51, deck.numberOfCards());
    }




}
