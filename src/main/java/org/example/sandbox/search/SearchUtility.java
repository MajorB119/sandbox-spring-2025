package org.example.sandbox.search;

public class SearchUtility {

    public static int linearSearch(int[] array, int targetValue) {
        int found = -1;
        int index = 0;
        for (int i : array) {
            if (i == targetValue) {
                found = index;
                break;
            }
            index++;
        }

        return found;
    }

    public static <T extends Comparable<T>> boolean linearSearch(T[] array, T target) {
        boolean found = false;
        for (T t : array) {
            if (t.compareTo(target) == 0) {
                found = true;
                break;
            }

        }
        return found;
    }

    public static int binarySearchRecursive(int[] array, final int targetValue) {

        return binarySearchRecursive(array, 0, (array.length-1), targetValue);

    }

    private static int binarySearchRecursive(int[] array, int min, int max, int targetValue) {

        if (min > max) {
            return -1;  // Target value not found
        }

        int mid = min + (max - min) / 2;

        if (array[mid] == targetValue) {
            return mid;
        } else if (array[mid] < targetValue) {
            // If target is greater, ignore left half of array
            return binarySearchRecursive(array, mid + 1, max, targetValue);
        } else {
            // if target is smaller, ignore right half of array
            return binarySearchRecursive(array, min, mid - 1, targetValue);
        }
    }

    public static int binarySearchIterative(int[] array, int targetValue) {

        int min = 0;
        int max = array.length - 1;

        while (min <= max) { // while we have some elements to search

            int mid = min + (max - min) / 2;

            if (array[mid] == targetValue) {
                return mid; // Target value found
            } else if (array[mid] < targetValue) {
                // If target is greater, ignore left half of array
                min = mid + 1;
            } else if (array[mid] > targetValue) {
                // if target is smaller, ignore right half of array
                max = mid - 1;
            }
        }
        return -1;
    }
}
