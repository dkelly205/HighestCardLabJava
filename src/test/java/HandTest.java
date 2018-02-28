import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
//    Card card;
//    Card card2;

    @Before
    public void before(){
//        card = new Card(SuitType.HEARTS, ValueType.EIGHT);
//        card2 = new Card(SuitType.DIAMONDS, ValueType.FIVE);
        hand = new Hand();
    }

    @Test
    public void testHandStartsEmpty(){
        assertEquals(0, hand.numberOfCards());
    }
}
