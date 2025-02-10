package org.example.sandbox.cards.pinochle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PinochleDeckTest {

    private PinochleDeck deck;

    @BeforeEach
    void setUp() {
        deck = new PinochleDeck();
    }

    @Test
    void testNewDeck() {
        List<Card> cards = deck.getDeck();
        assertEquals(48, cards.size(), "Pinochle deck should have 48 cards");
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

        // setup
        int testIndex = 24;
        Card expectedCard = deck.getDeck().get(testIndex);

        // exercise
        deck.cut(testIndex);
        Card actualCard = deck.getDeck().get(0);

        // assert
        assertEquals(expectedCard, actualCard, "First card should be the " + (testIndex + 1) + "th card in original deck");
    }

    @Test
    void testDeal() {
        Card topCard = deck.getDeck().get(0);
        Card dealtCard = deck.deal();
        assertEquals(topCard, dealtCard, "Dealt card should be the top card");
        assertEquals(47, deck.size(), "Deck should have 47 cards after dealing one");
    }

    @Test
    void testTurnOver() {
        Card topCard = deck.getDeck().get(0);
        Card turnedCard = deck.turnOver();
        assertEquals(topCard, turnedCard, "Turned over card should be the top card");
        assertEquals(48, deck.size(), "Deck size should remain 48 after turning over");
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
        assertEquals(new PinochleDeck().getDeck(), cards, "Deck should be in new order");
    }

    @Test
    void testDraw() {
        Card topCard = deck.getDeck().get(0);
        Card drawnCard = deck.draw();
        assertEquals(topCard, drawnCard, "Drawn card should be the top card");
        assertEquals(47, deck.size(), "Deck should have 47 cards after drawing one");
    }
}