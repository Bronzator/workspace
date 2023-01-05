//Code from Friday:
/**
 * This program finds the most frequent digit in a given number. If there is a tie, then the program returns the
 * lower number.
 * This version applies procdeal decomp
 *
 * @author: First Last
 * @since: September 23, 2022
 * @version: 1.0
 */

package Ch7Arrays;

public class ArrayTallyV2 {
    public static void main(String[] args) {
        int[] tally = new int[10];
        tallyDigit(49301,tally);
        System.out.println(mode(tally));
    }
    //create an array of integer of size 10
     //creates an int array of size 10
    //create a method called tally digits that accepts two integers
    //create a method called get mod that accepts on parameter of the type array of int

    /**
     * This method tallies all the digits in num
     * @param num is the number to tally
     * @param tally contains the frequency analysis of num.
     */
    public static void tallyDigit(int num, int[] tally) {
        while (num > 0) {
            int digit = num % 10;
            tally[digit]++;
            num /= 10;
        }
    }

    /**
     * 
     * @param tally
     * @return
     */
    public static int mode(int [] tally) {
            int mode = -1;
            int frequency = -1;
            for (int i = tally.length - 1; i >= 0; i--) {
                if (tally[i] >= frequency) {
                    frequency = tally[i];
                    mode = i;
                }
            }
            return mode;
        }
    }

