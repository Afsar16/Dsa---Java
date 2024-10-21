package _01Practice.Recursion;

public class P2 {
    public static void main(String[] args) {
        int N = 8;
//        int a = fibonacciFor(N);
//        System.out.println(a);
        int b = fiborecc(N);
        System.out.println(b);

    }

    private static int fiborecc(int n) {
        if(n <= 1) {
            return n;
        }
        return fiborecc(n-1) + fiborecc(n-2);
    }

    private static int fibonacciFor(int n) {
        int a=0, b=1, c=0;
        if(n <= 1) {
            return n;
        }
        for (int i = 2; i <=n; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}

