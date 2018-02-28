import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
    Deck deck;
//    Card card;
//    Card card2;

    @Before
    public void before(){
//        card = new Card(SuitType.HEARTS, ValueType.EIGHT);
//        card2 = new Card(SuitType.DIAMONDS, ValueType.FIVE);
        deck = new Deck();
        hand = new Hand();
    }

    @Test
    public void testHandStartsEmpty(){
        assertEquals(0, hand.numberOfCards());
    }

    @Test
    public void testCanAddCardToHand(){
        deck.populateDeck();
        deck.shuffleCards();
        hand.receiveCard(deck);
        assertEquals(51, deck.numberOfCards());
        assertEquals(1, hand.numberOfCards());
    }
}
