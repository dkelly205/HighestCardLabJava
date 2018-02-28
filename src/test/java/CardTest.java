import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;
    Card card1;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, ValueType.EIGHT);
        card1 = new Card(SuitType.HEARTS, ValueType.ACE);

    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void aceHasValue1(){
        assertEquals(1, card1.getValueOfCard());
    }
}
