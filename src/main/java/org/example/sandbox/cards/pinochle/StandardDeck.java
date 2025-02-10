package org.example.sandbox.cards.pinochle;

import java.util.ArrayList;
import java.util.List;

/**
 * This could benefit from using an abstract class as there are a lot of common method
 * implementations between deck types. Ran out of time to implement abstract class.
 */
public class StandardDeck extends AbstractDeck {

     public StandardDeck() {
        this.cards = newDeck();
    }


    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue : StandardFaceValue.values()) {
                newDeck.add(new Card(suit, faceValue));
            }
        }
        return newDeck;
    }

    @Override
    public void newOrder() {
        this.cards = newDeck();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StandardDeck {");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
