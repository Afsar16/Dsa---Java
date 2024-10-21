package _02_SDE_sheet.day1_arrays;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        boolean row = false;
        boolean col = false;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) row = true;
                    if(j == 0) col = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++) {
            for(int j=1; j<matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(row) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if(col) {
            for(int i=0; i<matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{0,1,2},{1,2,3},{1,0,1}};
        System.out.println("before");

        for(int[] m: matrix) {
            for (int i = 0; i < m.length ; i++) {
                System.out.print(m[i]);
            }
            System.out.println();
        }
        setZeroes(matrix);

        System.out.println("After");

        for(int[] m: matrix) {
            for (int i = 0; i < m.length ; i++) {
                System.out.print(m[i]);
            }
            System.out.println();
        }
    }
}


/*
-----------------brute force solution 1:---------------
public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Create a copy of the matrix
        int[][] copy = new int[m][n];

        // Copy the original matrix to the copy
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = matrix[i][j];
            }
        }

        // Identify the rows and columns to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (copy[i][j] == 0) {
                    // Set entire row and column in the original matrix to zero
                    for (int k = 0; k < n; k++) {
                        matrix[i][k] = 0; // Zeroing row
                    }
                    for (int k = 0; k < m; k++) {
                        matrix[k][j] = 0; // Zeroing column
                    }
                }
            }
        }
    }
}


-----------------brute force solution 2:---------------
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean []rows = new boolean[matrix.length];
        boolean []cols = new boolean[matrix[0].length];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}


----------------- optimal solution ------------------
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row = false;
        boolean col = false;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) row = true;
                    if(j == 0) col = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
            for(int i=1; i<matrix.length; i++) {
                for(int j=1; j<matrix[0].length; j++) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            if(row) {
                for(int j=0; j<matrix[0].length; j++) {
                    matrix[0][j] = 0;
                }
            }

            if(col) {
                for(int i=0; i<matrix.length; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }

* */