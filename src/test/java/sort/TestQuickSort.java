package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestQuickSort {
    @Test
    public void testQuickSort() {
        int[] inputArray = {12, 11, 13, 5, 6, 7};
        int[] expectedArray = {5, 6, 7, 11, 12, 13};

        QuickSort.quickSort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }
}
