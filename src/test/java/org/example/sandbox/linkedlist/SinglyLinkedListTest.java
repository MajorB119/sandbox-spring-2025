package org.example.sandbox.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList<String> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void testAddFirst() {
        list.addFirst("first");
        assertEquals("first", list.peekFirst());
        list.addFirst("second");
        assertEquals("second", list.peekFirst());
    }

    @Test
    void testAddLast() {
        list.addLast("first");
        assertEquals("first", list.peekLast());
        list.addLast("second");
        assertEquals("second", list.peekLast());
    }

    @Test
    void testPollFirst() {
        list.addFirst("first");
        list.addFirst("second");
        assertEquals("second", list.pollFirst());
        assertEquals("first", list.pollFirst());
        assertNull(list.pollFirst()); // Polling from an empty list should return null
    }

    @Test
    void testPollLast() {
        list.addLast("first");
        list.addLast("second");
        assertEquals("second", list.pollLast());
        assertEquals("first", list.pollLast());
        assertNull(list.pollLast()); // Polling from an empty list should return null
    }

    @Test
    void testPeekFirst() {
        list.addFirst("first");
        assertEquals("first", list.peekFirst());
        list.pollFirst();
        assertNull(list.peekFirst()); // Peeking into an empty list should return null
    }

    @Test
    void testPeekLast() {
        list.addLast("first");
        assertEquals("first", list.peekLast());
        list.pollLast();
        assertNull(list.peekLast()); // Peeking into an empty list should return null
    }

    @Test
    void testClear() {
        list.addFirst("first");
        list.addLast("second");
        list.clear();
        assertTrue(list.size() == 0);
    }

    @Test
    void testContains() {
        list.addFirst("first");
        list.addLast("second");
        assertTrue(list.contains("first"));
        assertTrue(list.contains("second"));
        assertFalse(list.contains("third"));
    }

    @Test
    void testSize() {
        assertEquals(0, list.size());
        list.addFirst("first");
        assertEquals(1, list.size());
        list.addLast("second");
        assertEquals(2, list.size());
        list.pollFirst();
        assertEquals(1, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testToString() {
        list.addFirst("first");
        list.addLast("second");
        assertEquals("[first, second]", list.toString());
    }
}