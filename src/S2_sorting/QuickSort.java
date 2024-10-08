package S2_sorting;

import static S2_sorting.MergeSort.mergeSort;

public class QuickSort {

    public static void quickSort(int[] arr, int begin, int end) {

        if (begin < end) {
            // Find the partition
            int partition = findPartition(arr, begin, end);

            // Do quick sort on the left part
            quickSort(arr, begin, partition - 1);

            // Do quick sort on the right part
            quickSort(arr, partition + 1, end);
        }
    }

    static int findPartition(int[] arr, int begin, int end) {

        // Taking last element as pivot element
        int pivot = arr[end];

        int i = (begin - 1); // index of smaller element

        for (int j = begin; j < end; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i + 1, end);

        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int swapTemp = arr[i];
        arr[i] = arr[j];
        arr[j] = swapTemp;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,6,5,4,8,9,7,0};
        int n = arr.length;
//        mergeSort(arr, n);
        quickSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

