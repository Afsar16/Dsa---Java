package _01Practice.Recursion;

public class P1 {

    private static int count = 0;
    public static void main(String[] args) {
//        printName();
        int N = 11;
//        printN(N);
//        printNameNoGlobalVar(1,5);
//        ans = sumOfFirstN(N, 0);
//        System.out.println(ans);
//        sumOfFirstN(N, 0);
        int [] arr = {1,2,3,4,5};

        reverArray(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+ " ");
        }
    }

    private static void reverArray(int [] arr, int s, int e) {
        if(s >= e) {
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverArray(arr, s+1, e-1);
    }


    private static void sumOfFirstN(int n, int sum) {
        if(n < 1) {
            System.out.println(sum);
            return;
        }

        sumOfFirstN(n-1, sum+n);

    }

    private static void printNameNoGlobalVar(int i, int n) {
        if(i > n) return;
        System.out.println("afsar");
        printNameNoGlobalVar(i+1, n);
    }

    private static void printN(int n) {
        if(n == 0) return;
//        System.out.println(n); // n - 1
        printN(n-1);
        System.out.println(n); // 1 - n
    }

    private static void printName() {
        if(count == 5) return;
        System.out.println("afsar");
        count++;
        printName();
    }
}

