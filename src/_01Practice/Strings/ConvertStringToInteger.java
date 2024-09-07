package _01Practice.Strings;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(sum);
        String b = String.valueOf(sum);
        System.out.println(b);
        System.out.println(b.getClass().getName());
        Integer sumInt = sum;
        System.out.println(sumInt.getClass().getName());
    }
}

