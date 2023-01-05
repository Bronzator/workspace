package Ch7Arrays;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {
        int [][]arr ={  {2,7,6},
                        {9,5,1},
                        {4,3,8}};
        rowSum(arr);
        columnSum(arr);
        diagSum(arr);
    }
    public static void rowSum(int [][]arr){
        int []hold = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j<arr[0].length;j++){
                hold[i] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(hold));
    }
    public static void columnSum(int[][]arr){
        int []hold2 = new int[arr[0].length];
        for (int i = 0;i < arr[0].length;i++){
            for (int j = 0;j<arr.length;j++){
                hold2[i] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(hold2));
    }
    public static void diagSum(int[][]arr){
        int []hold3 = new int[2];
        int temp = 0;
        for (int i = 0;i < arr[0].length;i++){
            for (int j = 0;j<arr.length;j++){
                hold3[temp] += arr[j-i][j];
            }
            temp++;
        }
        System.out.println(Arrays.toString(hold3));
    }
}
