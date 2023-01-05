//traverse 2D matrix row-major or column-major
package Ch7Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * This program traverses a 2D matrix in 8 different ways and collapses them into an array
 * @author : First Last
 * @since : Thursday, October 13, 2022
 * @version : 1.0
 */

public class Traverse2DMatrix {
    public static void main(String[] args) {

    int[][] grid = {{1,2,3,4,5},
                    {2,4,6,8,10},
                    {3,6,9,12,15}};
        System.out.println(Arrays.toString(collapesCallTopBottom(grid)));
        System.out.println(Arrays.deepToString(grid));
        System.out.println(Arrays.toString(zigZagRTL(grid)));
    }
    public static int[] collapesCallTopBottom(int[][]grid){
        int counter = 0;
        int[] collapsed = new int[grid.length * grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                collapsed[counter] = grid[j][i];
                counter++;
            }
        }
        return collapsed;
    }
    public static int[] zigZagRTL(int[][] grid) {
        int[] collapsed = new int[grid.length * grid[0].length];
        int counter = 0;

        for (int rows = 0; rows < grid.length; rows++) {
            for (int cols = 0; cols < grid[0].length; cols++) {
                if (rows % 2 == 0) { //even rows
                    collapsed[counter] = grid[rows][grid[rows].length - 1 - cols];
                } else {
                    collapsed[counter] = grid[rows][cols];
                }
                counter++;
            }
        }
        return collapsed;
    }
}