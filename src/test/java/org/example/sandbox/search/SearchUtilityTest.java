package org.example.sandbox.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchUtilityTest {

    @Test
    void testLinearSearchIntArrayFound() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(2, SearchUtility.linearSearch(array, 6));
    }

    @Test
    void testLinearSearchIntArrayNotFound() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(-1, SearchUtility.linearSearch(array, 5));
    }

    @Test
    void testLinearSearchGenericArrayFound() {
        String[] array = {"apple", "banana", "cherry"};
        assertTrue(SearchUtility.linearSearch(array, "banana"));
    }

    @Test
    void testLinearSearchGenericArrayNotFound() {
        String[] array = {"apple", "banana", "cherry"};
        assertFalse(SearchUtility.linearSearch(array, "grape"));
    }

    @Test
    void testBinarySearchRecursiveFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(3, SearchUtility.binarySearchRecursive(array, 7));
    }

    @Test
    void testBinarySearchRecursiveNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, SearchUtility.binarySearchRecursive(array, 4));
    }

    @Test
    void testBinarySearchRecursiveEmptyArray() {
        int[] array = {};
        assertEquals(-1, SearchUtility.binarySearchRecursive(array, 1));
    }

    @Test
    void testBinarySearchIterativeFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(4, SearchUtility.binarySearchIterative(array, 9));
    }

    @Test
    void testBinarySearchIterativeNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, SearchUtility.binarySearchIterative(array, 2));
    }

    @Test
    void testBinarySearchIterativeEmptyArray() {
        int[] array = {};
        assertEquals(-1, SearchUtility.binarySearchIterative(array, 1));
    }

    @Test
    void testBinarySearchIterativeSingleElementFound() {
        int[] array = {5};
        assertEquals(0, SearchUtility.binarySearchIterative(array, 5));
    }

    @Test
    void testBinarySearchIterativeSingleElementNotFound() {
        int[] array = {5};
        assertEquals(-1, SearchUtility.binarySearchIterative(array, 10));
    }

    @Test
    void testBinarySearchRecursiveSingleElementFound() {
        int[] array = {5};
        assertEquals(0, SearchUtility.binarySearchRecursive(array, 5));
    }

    @Test
    void testBinarySearchRecursiveSingleElementNotFound() {
        int[] array = {5};
        assertEquals(-1, SearchUtility.binarySearchRecursive(array, 10));
    }
}