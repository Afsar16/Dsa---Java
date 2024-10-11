package _01_DataStructures.Graphs;

public class NumberOfProvinces {
        public static int findCircleNum(int[][] isConnected) {
            int [] visited = new int[isConnected.length];
            int num = 0;
            for(int i=0; i<visited.length; i++) {
                if(visited[i] == 0) {
                    helper(isConnected, visited, i);
                    num++;
                }
            }
            return num;
        }
        public static void helper(int [][] isConnected, int[] visited, int i) {
            for(int j=0; j<isConnected.length; j++) {
                if(isConnected[i][j] == 1 && visited[j] == 0) {
                    visited[j] = 1;
                    helper(isConnected, visited, j);
                }
            }
        }

    public static void main(String[] args) {

        // Example 1
        int[][] isConnected1 = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        System.out.println("Number of provinces: " + findCircleNum(isConnected1));

        // Example 2
//        int[][] isConnected2 = {
//                {1, 0, 0, 1},
//                {0, 1, 1, 0},
//                {0, 1, 1, 1},
//                {1, 0, 1, 1}
//        };
//        System.out.println("Number of provinces: " + findCircleNum(isConnected2));
    }
}
