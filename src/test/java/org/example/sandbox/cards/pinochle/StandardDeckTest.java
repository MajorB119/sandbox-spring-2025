package org.example.sandbox.cards.pinochle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StandardDeckTest {

    private StandardDeck deck;

    @BeforeEach
    void setUp() {
        deck = new StandardDeck();
    }

    @Test
    void testNewDeck() {
        List<Card> cards = deck.getDeck();
        assertEquals(52, cards.size(), "Deck should have 52 cards");
    }

    @Test
    void testShuffle() {
        List<Card> originalOrder = List.copyOf(deck.getDeck());
        deck.shuffle();
        List<Card> shuffledOrder = deck.getDeck();
        assertNotEquals(originalOrder, shuffledOrder, "Deck should be shuffled");
    }

    @Test
    void testCut() {
        int testIndex = 26;
        Card expectedCard = deck.getDeck().get(testIndex);
        deck.cut(testIndex);
        Card actualCard = deck.getDeck().get(0);
        assertEquals(expectedCard, actualCard, "First card should be the " + (testIndex + 1) + "th card in original deck");
    }

    @Test
    void testDeal() {
        Card topCard = deck.getDeck().get(0);
        Card dealtCard = deck.deal();
        assertEquals(topCard, dealtCard, "Dealt card should be the top card");
        assertEquals(51, deck.size(), "Deck should have 51 cards after dealing one");
    }

    @Test
    void testTurnOver() {
        Card topCard = deck.getDeck().get(0);
        Card turnedCard = deck.turnOver();
        assertEquals(topCard, turnedCard, "Turned over card should be the top card");
        assertEquals(52, deck.size(), "Deck size should remain 52 after turning over");
    }

    @Test
    void testSearch() {
        Card card = deck.getDeck().get(10);
        int index = deck.search(card);
        assertEquals(10, index, "Card should be found at index 10");
    }

    @Test
    void testNewOrder() {
        deck.shuffle();
        deck.newOrder();
        List<Card> cards = deck.getDeck();
        assertEquals(new StandardDeck().getDeck(), cards, "Deck should be in new order");
    }

    @Test
    void testDraw() {
        Card topCard = deck.getDeck().get(0);
        Card drawnCard = deck.draw();
        assertEquals(topCard, drawnCard, "Drawn card should be the top card");
        assertEquals(51, deck.size(), "Deck should have 51 cards after drawing one");
    }
}