package _01_DataStructures.Graphs;

public class NumberOfIslands {
    static public int numIslands(char[][] grid) {

        if(grid == null  || grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int nislands = 0;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(grid[i][j] == '1') {
                    nislands++;
                    dfs(grid, i, j);
                }
            }
        }
        return nislands;
    }

    static private void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j] == '0' ) {
            return;
        }
        grid[i][j] = '0';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);

    }
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int numberOfIslands = numIslands(grid);
        System.out.println("Number of islands: " + numberOfIslands);
    }
}


