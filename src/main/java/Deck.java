import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;
    private Card card;

    public Deck(){
        this.deck = new ArrayList<Card>();
    }

    public void populateDeck(){
        for (SuitType suit : SuitType.values()){
            for(ValueType value : ValueType.values()){
                deck.add(new Card(suit, value));

            }
        }
    }

    public int numberOfCards(){
        return this.deck.size();
    }

    public void shuffleCards(){
        Collections.shuffle(deck);
    }

    public Card dealCards(){
        shuffleCards();
        return this.deck.remove(0);
    }


}
