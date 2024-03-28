package search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void testBinarySearchFound() {
        BinarySearch bs = new BinarySearch();
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;
        int expectedResult = 2;
        int actualResult = bs.binarySearch(array, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchNotFound() {
        BinarySearch bs = new BinarySearch();
        int[] array = {1, 3, 5, 7, 9};
        int target = 6;
        int expectedResult = -1;
        int actualResult = bs.binarySearch(array, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        BinarySearch bs = new BinarySearch();
        int[] array = {};
        int target = 5;
        int expectedResult = -1;
        int actualResult = bs.binarySearch(array, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchNullArray() {
        BinarySearch bs = new BinarySearch();
        int[] array = null;
        int target = 5;
        int expectedResult = -1;
        int actualResult = bs.binarySearch(array, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchSingleElementFound() {
        BinarySearch bs = new BinarySearch();
        int[] array = {5};
        int target = 5;
        int expectedResult = 0;
        int actualResult = bs.binarySearch(array, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchSingleElementNotFound() {
        BinarySearch bs = new BinarySearch();
        int[] array = {3};
        int target = 5;
        int expectedResult = -1;
        int actualResult = bs.binarySearch(array, target);
        assertEquals(expectedResult, actualResult);
    }
}
