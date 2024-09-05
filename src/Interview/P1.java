package Interview;

public class P1 {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int target = 1;
        int n  = arr.length;
        int s = 0;
        int e = n-1;
        int mid = 0;

        for(int i=0; i<n; i++) {
            if(target < arr[0]) {
                mid = 0;
                System.out.println(mid);
                return;
            }
            mid = (s+e) / 2;
            if(arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < target) {
                s = mid + 1;

            }
            else {
                e = mid - 1;
            }
        }
        System.out.println(mid+1);

    }
}
