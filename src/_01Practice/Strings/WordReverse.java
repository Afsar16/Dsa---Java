package _01Practice.Strings;

public class WordReverse {
    public static void main(String[] args) {
        String str = "welcome to java world";
        StringBuilder sb = new StringBuilder();
        String []strArray = str.split(" ");

        for(int i=strArray.length-1; i >= 0; i--) {
            sb.append(strArray[i]);
            sb.append(" ");
        }
        String strUpdated = sb.toString();
        System.out.println(sb);
        System.out.println(strUpdated);
    }
}

