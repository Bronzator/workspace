package Ch7Arrays;
import java.util.Scanner;

public class SebastianLassanderWeatherAnalysisV1 {
    public static void main(String[] args) {
        //setting up scanners
        Scanner input = new Scanner (System.in);
        // asks the amount of days data that we will be taking in, this will be the length of the array.
        System.out.print("How many days temperature: ");
        double hold = 0.0;
        int days = input.nextInt();
        int [] array = new int [days];
        // runs a loop the amount of days that data will be taken that will ask for each day's temperature
        for(int i = 0;i<=array.length-1;i++){
            System.out.print("Day " + (i+1) + "'s high temperature: ");
            int temp = input.nextInt();
            array[i] = temp;
            // puts all the temperatures into one variable that will be used to figure out the average
            hold += temp;
        }
        // divides all the temperatures by the amount of days to get the average
        double average = hold/days;
        System.out.println("The average temp is " + Math.round(average * 10.0) / 10.0);
        int count = 0;
        // compares the average to each temperature by going through the array
        for(int i = 0;i<=array.length-1;i++){
           if(average < array[i]) {
               count+=1;
           }
        }
        System.out.println("There was " + count + " above average.");
    }
}
