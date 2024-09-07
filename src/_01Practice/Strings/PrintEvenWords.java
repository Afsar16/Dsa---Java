package _01Practice.Strings;

public class PrintEvenWords {
    public static void main(String[] args) {
        String str = new String();
        str = "1234 hi hello bro what are you doings ";
        System.out.println(str);

        for(String s: str.split(" ")) {
            if(s.length() % 2 == 0) {
                System.out.print(s + " ");
            }
        }
    }
}
