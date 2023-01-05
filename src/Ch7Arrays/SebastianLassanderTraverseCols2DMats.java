package Ch7Arrays;

import java.util.Arrays;

public class SebastianLassanderTraverseCols2DMats {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,5},
                {2,4,6,8,10},
                {3,6,9,12,15}
        };
        int [] collapse = new int[arr.length * arr[0].length];
        topBottom(arr,collapse);
        bottomTop(arr,collapse);
        zigZagStartTop(arr,collapse);
        zigZagStartBottom(arr,collapse);
    }
    public static void topBottom(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr[0].length;i++){
            for (int j = 0; j < arr.length;j++){
                collapse[count] = arr[j][i];
                count++;
            }
        }
        System.out.println("This is the collapsed array from top to bottom: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
    public static void bottomTop(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr[0].length;i++){
            for (int j = 0; j < arr.length;j++){
                collapse[count] = arr[arr.length-1-j][i];
                count++;
            }
        }
        System.out.println("This is the collapsed array from bottom to top: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
    public static void zigZagStartTop(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr[0].length;i++){
            for (int j = 0; j < arr.length;j++){
                if (i%2 == 0) {
                    collapse[count] = arr[j][i];
                }
                else{
                    collapse[count] = arr[arr.length-1-j][i];
                }
                count++;
            }
        }
        System.out.println("This is the collapsed array in a zigzag formation starting on the top: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
    public static void zigZagStartBottom(int[][]arr,int [] collapse){
        int count = 0;
        for (int i = 0; i < arr[0].length;i++){
            for (int j = 0; j < arr.length;j++){
                if (i%2 != 0) {
                    collapse[count] = arr[j][i];
                }
                else{
                    collapse[count] = arr[arr.length-1-j][i];
                }
                count++;
            }
        }
        System.out.println("This is the collapsed array in a zigzag formation starting on the bottom: " + Arrays.toString(collapse));
        System.out.println("This is the original 2D array: " + Arrays.deepToString(arr) + "\n");
    }
}
