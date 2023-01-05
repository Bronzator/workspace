//Code from Friday:
/**
 * This program finds the most frequent digit in a given number. If there is a tie, then the program returns the
 * lower number
 *
 * @author: First Last
 * @since: September 23, 2022
 * @version: 1.0
 */

package Ch7Arrays;

public class ArrayTally {
    public static void main(String[] args) {
        System.out.println(mostFrequentDigit(49301));
    }

    //Step1: create a method called mostFrequentDigit that accepts a parameter of type int
    public static int mostFrequentDigit(int num) {
//Step2: create an array of integer of size 10
        int[] tally = new int[10]; //creates an int array of size 10

//Step3: create a while loop that processes all the digits of the given number
        while (num > 0) {
//Step4: mod the given number by 10 and increment the value at that index in the array by 1
            int digit = num % 10;
            tally[digit]++;
//tally[num%10]++;

//Step5: drop the digit (divide by 10)
            num /= 10; //num = num / 10
        }
//Step6: traverse the tally array from right to left and return the index with the highest value
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
