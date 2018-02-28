import java.util.ArrayList;

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

    public Card deal(Card card){
        return this.deck.remove(card);
    }


}
