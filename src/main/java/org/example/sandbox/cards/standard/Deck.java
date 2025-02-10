package org.example.sandbox.cards.standard;

import javax.naming.OperationNotSupportedException;

public interface Deck {

    void shuffle();
    void cut(int index);
    Card deal();
    Card turnOver();
    int search(Card card);
    void newOrder();
    Card draw();
    int size();

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}
