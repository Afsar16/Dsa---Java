package S2_sorting;

import static S2_sorting.QuickSort.quickSort;

public class MergeSort {

        public static void mergeSort(int[] arr, int numberOfElements) {
            if (numberOfElements < 2) {
                return;
            }

            // Find the middle position and create left and right partitions
            int mid = numberOfElements/2;
            int[] leftArr = new int[mid];
            int[] rightArr = new int[numberOfElements - mid];

            // Fill up the partitions
            for (int i = 0; i < mid; i++) {
                leftArr[i] = arr[i];
            }

            for (int i = mid; i < numberOfElements; i++) {
                rightArr[i- mid] = arr[i];
            }

            // Apply merge sort on the left parition
            mergeSort(leftArr, mid);

            // Apply merge sort on the right partition
            mergeSort(rightArr, numberOfElements  - mid);

            // Finally merge the partitions
            merge(arr, leftArr, rightArr, mid, numberOfElements - mid);
        }

        private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
            int i = 0, j = 0, k = 0;

            // Merge arrays based on the smaller values
            while (i < left && j < right) {
                if (leftArr[i] <= rightArr[j]) {
                    arr[k++] = leftArr[i++];
                }
                else {
                    arr[k++] = rightArr[j++];
                }
            }

            // Fill out remaining values if any
            while (i < left) {
                arr[k++] = leftArr[i++];
            }
            while (j < right) {
                arr[k++] = rightArr[j++];
            }
        }

    public static void main(String[] args) {
        int [] arr= {1,2,3,6,5,4,8,9,7,0};
        int n = arr.length;
        mergeSort(arr, n);
//            quickSort(arr,0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

