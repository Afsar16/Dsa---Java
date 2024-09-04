package S1.Reccursion;

public class ReverseArray {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int s = 0;
        int e = n-1;
//        reverse(arr,n);
        reverseReccusive(arr, s, e);
        for(int i=0; i<n; i++) {
            System.out.printf(arr[i] + " ");
        }
    }

    private static void reverseReccusive(int[] arr, int s, int e) {
        if(s >= e) {
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverseReccusive(arr, s+1, e-1);
    }

    private static void reverse(int[] arr, int n) {
        int s = 0;
        int e = n-1;
        while(s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
