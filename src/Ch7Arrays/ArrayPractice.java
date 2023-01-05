package Ch7Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What size do you want the array? \nWhat range do you want the numbers within the array? ");
        int arrSize = input.nextInt();
        int numRange = input.nextInt();
        int array[] = new int[(int) (Math.random()*arrSize-1)];
        for(int i = 0;i<=array.length-1;i++){
            array[i] = (int)(Math.random()*numRange-1);
        }
        System.out.println(Arrays.toString(array));
    }
}
