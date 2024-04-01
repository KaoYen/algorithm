package search;

public class BinarySearch {

    /**+
     * 二分搜尋法（Binary Search）是一種在有序數組中查找特定元素的搜尋算法。其概念是通過比較目標值和數組中間位置的值來判斷目標值可能在數組的哪一部分，進而進行迭代搜索。
     *
     * 二分搜尋法的步驟如下：     *
     * 1. 初始化左邊界 left 為數組的第一個索引，右邊界 right 為數組的最後一個索引。
     * 2. 在每一輪迭代中，計算中間位置索引 mid，即 mid = (left + right) / 2。
     * 3. 將目標值與數組中的 array[mid] 比較：
     *  - 如果目標值等於 array[mid]，則返回 mid，表示找到了目標值。
     *  - 如果目標值小於 array[mid]，則將右邊界 right 更新為 mid - 1，在數組的左半部分繼續搜索。
     *  - 如果目標值大於 array[mid]，則將左邊界 left 更新為 mid + 1，在數組的右半部分繼續搜索。
     * 4. 重複步驟2和步驟3，直到左邊界 left 大於右邊界 right，表示整個數組已被搜索完畢。
     *
     * 如果目標值在數組中存在，則二分搜尋法能夠在時間複雜度為O(log n)的情況下找到該值的位置，其中n為數組的大小。這使得二分搜尋法成為一種高效的查找算法，特別是當數組非常大時。
     *
     * @param sortedArray
     * @param target
     * @return
     */
    public int binarySearch(int[] sortedArray, int target) {
        if (sortedArray == null || sortedArray.length == 0) {
            return -1;
        }

        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArray[mid] == target) {
                return mid;
            } else if (sortedArray[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
