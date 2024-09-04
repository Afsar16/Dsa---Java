package Z_OOC;

class MathOperations {
    // Method overloading by changing the number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class _4Polymorphism_methodLoading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));        // Output: 5
        System.out.println(math.add(2, 3, 4));     // Output: 9
    }
}
