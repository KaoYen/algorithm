package sort;

/**
 * Merge Sort（合併排序）是一種分治法的排序演算法，其步驟如下：
 *
 * 分割（Divide）：
 * 首先將待排序的數列分割為兩個大致相等的子數列，直到每個子數列只有一個元素為止。這是遞迴的起始階段。
 * 例如，若原始數列有 n 個元素，則每次分割都會將數列劃分成兩個長度為 n/2 的子數列。
 *
 * 排序（Conquer）：
 * 遞迴地對每個子數列進行排序。
 * 每個子數列只包含一個元素時，即視為已經排序完成。
 *
 * 合併（Merge）：
 * 將已排序的子數列合併為一個更大的有序數列。
 * 從兩個已排序的子數列的起始位置開始比較元素，選擇較小（或較大）的元素放入新的數列中。
 * 當其中一個子數列的元素全部被放入新的數列後，將另一個子數列中剩餘的元素直接放入新的數列中。
 *
 * 返回（Return）：
 * 遞迴返回上一層，持續合併上一層的子數列，直到回到最初的原始數列，此時數列已完全排序。
 *
 * 在合併排序的整個過程中，分割、排序和合併的步驟不斷重複，直到所有子數列都被合併為一個完全排序的數列。
 * 整個過程可以看作是一個自頂向下的遞迴過程，在每一層遞迴中，都會對子數列進行相同的操作，直到達到排序的最終目標。
 */
public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int[] tempArray = new int[array.length]; //用於儲存臨時掃併結果的數組
        mergeSort(array, tempArray, 0, array.length - 1);
    }


    private static void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, tempArray, left, mid); // 對左半部進行掃併排序
            mergeSort(array, tempArray, mid + 1, right); // 對右半部進行掃併排序
            merge(array, tempArray, left, mid, right); //掃併左右兩部份
        }
    }


    private static void merge(int[] array, int[] tempArray, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tempArray[i] = array[i];
        }

        int i = left; // 左半部份起始索引
        int j = mid + 1; // 右半部分起始索引
        int k = left; // 合併後數組的起始索引

        // 逐個比較左右兩部分元素，並按順序放入元素組中
        while (i <= mid && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k++] = tempArray[i++];
            } else {
                array[k++] = tempArray[j++];
            }
        }

        // 將剩餘的左半部份元素複製到原數組中
        while (i <= mid) {
            array[k++] = tempArray[i++];
        }

        // 注意：右半部分無須複製，因為右半部分已經在原數組中
    }
}
