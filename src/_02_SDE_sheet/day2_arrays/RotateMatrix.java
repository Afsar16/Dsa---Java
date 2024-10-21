package _02_SDE_sheet.day2_arrays;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<(n+1)/2; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int [][] matrix = {{0,1,2},{1,2,3},{1,0,1}};
        for(int[] m: matrix) {
            for (int i = 0; i < m.length ; i++) {
                System.out.print(m[i] + " ");
            }
            System.out.println();
        }

        rotate(matrix);
        System.out.println("After");

        for(int[] m: matrix) {
            for (int i = 0; i < m.length ; i++) {
                System.out.print(m[i] + " ");
            }
            System.out.println();
        }
    }
}

