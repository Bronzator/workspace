/**
 * This program reads some weather data and calculates the average temperature of a week. This program
 * calculates how many days were above average
 * @author: Sebastian Lassander
 * @version: 2
 * @since: September 14th,2022
 */

package Ch7Arrays;

import java.util.Scanner;

public class SebastianLassanderWeatherAnalysisV3 {
    /**
     * main method sets up scanners, and manages the flow of control.
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = intro(console);
        int array[] = new int[days];
        double average = dayTemp(console,days,array) / days;
        aboveAverage(array, average);
    }

    /**
     * Asks the user for the amount of days that the temperature will be recorded from. Then returns the days to the main method
     * @param console Scanner variable
     * @return returns the amount of days
     */
    public static int intro(Scanner console){
        System.out.print("How many days temperature");
        int days = console.nextInt();
        return days;
    }

    /**
     * Takes the amount of days and the array and makes a for loop go the amount of days there is asking the user for the temperature
     * and then storeing it in the array and the variable hold which will be returned to the main method to get the average temperature.
     * @param console Scanner variable
     * @param days amount of days that temo will be taken from
     * @param array the array holding all the days temp
     * @return returns all the days temperature added together
     */
    public static double dayTemp(Scanner console, int days,int array[]){
        double hold = 0.0;
        for(int i = 0;i<days;i++){
            System.out.print("Day " + (i+1) + "'s high temperature: ");
            int temp = console.nextInt();
            array[i] = temp;
            hold += temp;
        }
        return hold;
    }

    /**
     * Takes the array and the average and first shows the user the average temperature and then runs a for loop the length of the array
     * checking how many days temperature were above the average. Then it prints out this information.
     * @param array Holds all the days temperature
     * @param average The average temperature of each day
     */
    private static void aboveAverage(int[] array, double average) {
        System.out.println("Average temp is " + Math.round(average * 10.0) / 10.0);
        int count = 0;
        for(int i = 0; i<= array.length-1; i++){
            if(average < array[i]) {
                count+=1;
            }
        }
        System.out.println("There was " + count + " above average.");
    }
}
