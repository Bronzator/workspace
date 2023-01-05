package Ch7Arrays;

import java.util.Scanner;

/**
 * In this code I make a multiplication table that is scaled by user input
 */
public class SebastianLassanderMultTableMod {
    /**
     * Takes in the user input for the start and end number on the far left column
     * Setsup the table array
     * Calls upon the method that puts all the num within the array
     * Calls upon the method that prints the array in the proper format
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("X: ");
        int x = console.nextInt();
        System.out.print("Y: ");
        int y = console.nextInt();
        int n = (y-x)+1;
        int [][]table = new int[n][10];
        tableSetup(x,n,table);
        tablePrint(table);

    }

    /**
     * Takes in x,n,and the table and puts all the num in the table useig a for loop within a for loop
     * @param x first num on the far left column
     * @param n y-x +1
     * @param table the array containing the multiplication table
     */
    public static void tableSetup(int x,int n,int[][]table){
        for(int i =0;i < table.length;i++){
            for (int j = 0;j < table[0].length;j++){
                if (n!=0)
                    table[i][j] = x * (j+1);
                n--;
            }
            x++;
        }
    }

    /**
     * Prints each value within the 2d array and spaces it properly
     * @param table 2d array containing the multiplication table
     */
    public static void tablePrint(int [][] table){
        for(int i =0;i < table.length;i++){
            for (int j = 0;j < table[0].length;j++){
                System.out.print(table[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
