package org.example.sandbox.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListQueueTest {

    private ArrayListQueue<String> queue;

    @BeforeEach
    void setUp() {
        queue = new ArrayListQueue<>();
    }

    @Test
    void testOffer() {
        assertTrue(queue.offer("element1"));
        assertFalse(queue.isEmpty());
    }

    @Test
    void testPoll() {
        queue.offer("element1");
        queue.offer("element2");
        assertEquals("element1", queue.poll());
        assertEquals("element2", queue.poll());
        assertNull(queue.poll()); // Polling from an empty queue should return null
    }

    @Test
    void testPeek() {
        queue.offer("element1");
        assertEquals("element1", queue.peek());
        queue.poll();
        assertNull(queue.peek()); // Peeking into an empty queue should return null
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.offer("element1");
        assertFalse(queue.isEmpty());
        queue.poll();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testToString() {
        queue.offer("element1");
        queue.offer("element2");
        assertEquals("ArrayListQueue [element1, element2]", queue.toString());
    }

    @Test
    void testOfferNull() {
        assertThrows(NullPointerException.class, () -> queue.offer(null));
    }

    @Test
    void testPollEmptyQueue() {
        assertNull(queue.poll());
    }

    @Test
    void testPeekEmptyQueue() {
        assertNull(queue.peek());
    }
}