package Interview;

public class IslandAndWater {
    public static void main(String[] args) {
        int [][] arr;
        int count = 0;
        arr = new int[][]{{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr[0].length -1; j++) {
                if(arr[i][j] == 1 && arr[i][j+1] == 1 && arr[i+1][j] == 1) {

                }
            }
        }

    }
}
