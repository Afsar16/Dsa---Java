package S1_Learn_basics.Reccursion;

public class P1 {

    public static void printnum(int N) {
        if(N == 0) {
            return;
        }
        printnum(N-1);
        System.out.printf(N + " ");
    }

    public static long sumOfSeries(long n) {
        // code here
        if(n == 0) return n;
//        System.out.println(n*n*n);
        long val = n*n*n;
        return n*n*n + sumOfSeries(n-1);
    }

    public static int fact(int n){
        if(n == 0 || n == 1) return 1;

        return n * fact(n-1);
    }

    public static void main(String[] args) {
        int N = 10;
//        printnum(N);
//        long a = sumOfSeries(5);
//        System.out.println(a);
        int a = fact(5);
        System.out.println(a);
    }
}

