package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestMergeSort {
    @Test
    public void testMergeSort() {
        int[] inputArray = {12, 11, 13, 5, 6, 7};
        int[] expectedArray = {5, 6, 7, 11, 12, 13};

        MergeSort.mergeSort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }
}
