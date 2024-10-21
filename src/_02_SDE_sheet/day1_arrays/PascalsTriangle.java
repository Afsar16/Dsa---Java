package _02_SDE_sheet.day1_arrays;
import java.util.*;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Add 1 to the beginning of each row
            row.add(1);

            // Calculate the values in the middle of the row
            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(val);
            }

            // Add 1 to the end of each row
            if (i > 0) {
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> triangle = generate(5);
//        for(List<Integer> row: triangle) {
//            System.out.println(row);
//        }
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

/*
* // BF
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        return triangle;

    }
}

//OPTI - easy -> ST(study this)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Add 1 to the beginning of each row
            row.add(1);

            // Calculate the values in the middle of the row
            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(val);
            }

            // Add 1 to the end of each row
            if (i > 0) {
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}
* */