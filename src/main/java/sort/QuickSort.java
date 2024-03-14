package sort;

public class QuickSort {

    /**
     * 快速排序（Quick Sort）是一種常見且高效的排序算法，它通過遞迴地將數列分割成較小的子數列來進行排序。
     *
     * 以下是快速排序的詳細步驟：
     * 1. 選擇基準值： 基準值的選擇對快速排序的效率影響很大。通常情況下，我們可以簡單地選擇數列中的第一個元素作為基準值。
     * 在一些情況下，也可以通過某些方法選擇更好的基準值，比如取數列中間的元素或者使用隨機選擇。
     *
     * 2. 分割數列： 分割數列的方法是通過兩個指針（或索引）來進行的。一個指針從數列的左邊向右移動，
     * 找到一個大於等於基準值的元素；另一個指針從數列的右邊向左移動，找到一個小於等於基準值的元素。當這兩個指針都找到對應的元素時，
     * 交換它們的位置，使得小於基準值的元素在左邊，大於基準值的元素在右邊。重複這個過程直到兩個指針相遇，此時基準值的位置就是最終排序的位置。
     *
     * 3. 遞迴排序： 遞迴地對分割後的子數列進行快速排序，直到每個子數列只有一個元素或者是空數列時，排序完成。在遞迴排序過程中，每一次遞迴都會選擇一個新的基準值，對子數列進行分割和排序。
     *
     * 4. 合併： 當所有的子數列都完成排序後，整個數列也就排好序了。
     *
     * 總的來說，快速排序通過選擇基準值，分割數列，遞迴排序和合併子數列來實現高效的排序。該算法的時間複雜度為 O(n log n)，其中 n 是數列的大小。
     * @param arr
     */
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Pivot (Element to be placed at right position)
        int pivot = arr[high];
        // Index of smaller element and indicates the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
