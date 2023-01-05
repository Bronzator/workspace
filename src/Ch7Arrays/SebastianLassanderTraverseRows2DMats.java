package Ch7Arrays;

import java.util.Arrays;

public class SebastianLassanderTraverseRows2DMats {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,5},
                {2,4,6,8,10},
                {3,6,9,12,15}
        };
        int [] collapse = new int[arr.length * arr[0].length];
        leftRight(arr,collapse);
        rightLeft(arr,collapse);
        zigZagStartLeft(arr,collapse);
        zigZagStartRight(arr,collapse);
    }
    public static void leftRight(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[0].length;j++){
                collapse[count] = arr[i][j];
                count++;
            }
        }
        System.out.println("This is the collapsed array from left to right: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
    public static void rightLeft(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[0].length;j++){
                collapse[count] = arr[i][arr[0].length-1-j];
                count++;
            }
        }
        System.out.println("This is the collapsed array from right to left: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
    public static void zigZagStartLeft(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[0].length;j++){
                if (i%2 == 0) {
                    collapse[count] = arr[i][j];
                }
                else{
                    collapse[count] = arr[i][arr[0].length - 1 - j];
                }
                count++;
            }
        }
        System.out.println("This is the collapsed array in a zigzag formation starting on the left: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
    public static void zigZagStartRight(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[0].length;j++){
                if (i%2 == 0) {
                    collapse[count] = arr[i][arr[0].length - 1 - j];
                }
                else{
                    collapse[count] = arr[i][j];
                }
                count++;
            }
        }
        System.out.println("This is the collapsed array in a zigzag formation starting on the right: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
}
