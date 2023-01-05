package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SebastianLassanderRandomNumberArrayList {
    /**
     * Opens the file randomNumbers and puts all the int values into an array list
     * Also within the main method all the different functions are called upon that are needed.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> data = new ArrayList<Integer>();
        File data0 = new File("randomNumbers.txt");
        Scanner console = new Scanner(data0);
        while (console.hasNext()){
            data.add(Integer.valueOf(console.next()));
        }

        System.out.println(data);

        double average = dataAverage(data);

        aboveAverage(data,average);

        highLow(data);

        noEven(data);
    }

    /**
     * Takes all the int values and adds it together then divides it by the amount of items within the Array list to recieve a double, the average.
     * @param data
     * @return
     */
    public static double dataAverage(ArrayList<Integer> data){
        int average = 0;
        for (int i = 0;i < data.size();i++){
            average+=data.get(i);
        }
        System.out.println("Average: " + (double)average/data.size());
        return (double)average/data.size();
    }

    /**
     * Sorts the array list and then prints the highest and lowerst value
     * @param data
     * @return
     */
    public static ArrayList<Integer> highLow(ArrayList<Integer> data){
        Collections.sort(data);
        System.out.println("Highest: " + (data.size()-1) + "\nSmallest: " + data.get(0));
        return data;
    }

    /**
     * Takes the average and checks each value to see if it is above or below the average
     * @param data
     * @param average
     */
    public static void aboveAverage(ArrayList<Integer> data,double average){
        int above = 0;
        for (int i = 0;i < data.size();i++){
            if (data.get(i) > average){above++;}
        }
        System.out.println("Above average: " + above + "\nBelow average: " + (data.size() - above));
    }

    /**
     * Mods each value and sees if it was a 0 and if so it is removed from the array list. 
     * @param data
     */
    public static void noEven(ArrayList<Integer> data){
        for (int i = data.size()-1;i > 0;i--){
            if (data.get(i)%2 == 0){data.remove(i);}
        }
        System.out.println(data);
    }
}
