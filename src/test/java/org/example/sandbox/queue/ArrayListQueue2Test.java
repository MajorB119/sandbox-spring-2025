package org.example.sandbox.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListQueue2Test {

    private ArrayListQueue2<String> queue;

    @BeforeEach
    void setUp() {
        queue = new ArrayListQueue2<>();
    }

    @Test
    void testAdd() throws FailedOperationException {
        assertTrue(queue.add("element1"));
        assertFalse(queue.isEmpty());
    }

    @Test
    void testAddNull() {
        assertThrows(FailedOperationException.class, () -> queue.add(null));
    }

    @Test
    void testRemove() throws FailedOperationException {
        queue.add("element1");
        queue.add("element2");
        assertEquals("element1", queue.remove());
        assertEquals("element2", queue.remove());
    }

    @Test
    void testRemoveEmptyQueue() {
        assertThrows(FailedOperationException.class, () -> queue.remove());
    }

    @Test
    void testElement() throws FailedOperationException {
        queue.add("element1");
        assertEquals("element1", queue.element());
        queue.remove();
        assertThrows(FailedOperationException.class, () -> queue.element());
    }

    @Test
    void testElementEmptyQueue() {
        assertThrows(FailedOperationException.class, () -> queue.element());
    }

    @Test
    void testIsEmpty() throws FailedOperationException {
        assertTrue(queue.isEmpty());
        queue.add("element1");
        assertFalse(queue.isEmpty());
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testToString() throws FailedOperationException {
        queue.add("element1");
        queue.add("element2");
        assertEquals("[element1, element2]", queue.toString());
    }
}