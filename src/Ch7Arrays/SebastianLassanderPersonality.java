package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Main method calls upon each other method and has the while loop for the length of the file.
 */
public class SebastianLassanderPersonality {
    public static void main(String[] args) throws IOException {
        intro();
        Scanner console = new Scanner(System.in);
        Scanner input = input(console);
        PrintStream output = output(console);
        while (input.hasNextLine()) {
            String name = (input.nextLine());
            String wholeData = (input.nextLine());
            double[][] arr = calculateABAmount(wholeData);
            int [] Bpercent = new int[4];
            printToFile(arr,output,name,findPersonality(arr,Bpercent),Bpercent);

        }
    }

    /**
     * takes in the array containg the amount of A's and B's and then ties them to the term they are meant for
     * @param arr
     * @param Bpercent
     * @return personality
     */
    public static String findPersonality(double[][]arr, int[] Bpercent){
        String personality = " ";
        for (int i = 0;i<Bpercent.length;i++){
            Bpercent[i] = Math.toIntExact(Math.round((arr[i][1] / (arr[i][1] + arr[i][0])) * 100));
            if (Bpercent[i] == 50){personality+="X";}
            else if (i == 0 && Bpercent[i] > 50){personality+="I";}
            else if (i == 0 && Bpercent[i] < 50){personality+="E";}
            else if (i == 1 && Bpercent[i] > 50){personality+="i";}
            else if (i == 1 && Bpercent[i] < 50){personality+="S";}
            else if (i == 2 && Bpercent[i] > 50){personality+="F";}
            else if (i == 2 && Bpercent[i] < 50){personality+="T";}
            else if (i == 3 && Bpercent[i] > 50){personality+="P";}
            else if (i == 3 && Bpercent[i] < 50){personality+="J";}
        }
        return personality;
    }

    /**
     * Takes the name of the person, the persons information, and their personality score and prints it to the output file
     * @param arr
     * @param output
     * @param name
     * @param personality
     * @param Bpercent
     */
    public static void printToFile(double[][] arr, PrintStream output, String name, String personality, int [] Bpercent){
        String [] temp = new String[Bpercent.length];
        output.printf(name + ": \n");
        for (int i = 0; i < arr.length;i++){
            output.printf(arr[i][0] + "A - " + arr[i][1] + "B  ");
        }
        output.printf("\n");
        for (int i = 0;i < Bpercent.length;i++)
            temp[i] = (Bpercent[i]) + "%";
        output.println(Arrays.toString(temp) + " = " + personality);

    }

    /**
     * Gives a brief description of what the project does.
     */
    public static void intro() {
        System.out.println("Welcome to my personality test! In this program I will be taking in a file of answers you provide me" +
                " and showing you what your personality is based on those answers!");
        System.out.println("When giving the input file make sure it is the existing file containg your answers");
        System.out.println("The output file can be an existing empty file or a new file can be created");
    }

    /**
     * Gets the output file from the user and if it doesn't exist it is created
     * @param console
     * @return
     * @throws IOException
     */
    public static PrintStream output(Scanner console) throws IOException {
        System.out.println("Please give me a file name for the output file.");
        File output = new File(console.nextLine());
        if (output.createNewFile()) {
            System.out.println("File created: " + output.getName());
        }
        PrintStream fileOutput = new PrintStream(output);
        return fileOutput;
    }

    /**
     * Gets the input file from the user and will ask for it 3 times, and if by the end of the third time the file doesn't exist the program will end.
     * @param console
     * @return
     * @throws IOException
     */
    public static Scanner input(Scanner console) throws IOException {
        Scanner input = null;
        int count = 1;
        while (input == null && count < 4) {
            try {
                System.out.print("input file name? ");
                count++;
                File inputFile = new File(console.nextLine());
                input = new Scanner(inputFile);
            } catch (FileNotFoundException e) {
                System.out.println("File does not exist");
            }
        }
        if (input != null) {
            System.out.println("File found!");
        }
        return input;
    }

    /**
     * Calcualtes the amount of A's and B's within the persons response.
     * @param wholedata
     * @return
     */
    public static double[][] calculateABAmount(String wholedata) {
        double[][] arr = new double[4][2];
        int num = 0;
        for (int i = 0; i < wholedata.length(); i++) {
            char t = wholedata.charAt(i);

            if (t == 'A' || t == 'a') {
                if (i % 7 == 0) {
                    arr[0][0]++;
                }
                else if (i % 7 == 1 || i % 7 == 2){
                    arr[1][0]++;
                }
                else if (i % 7 == 3 || i % 7 == 4){
                    arr[2][0]++;
                }
                else if (i % 7 == 5 || i % 7 == 6) {
                    arr[3][0]++;
                }
            }
            else if (t == 'B' || t == 'b') {
                if (i % 7 == 0) {
                    arr[0][1]++;
                }
                else if (i % 7 == 1 || i % 7 == 2) {
                    arr[1][1]++;
                }
                else if (i % 7 == 3 || i % 7 ==4) {

                    arr[2][1]++;
                }
                else if (i % 7 == 5 || i % 7 == 6) {
                    arr[3][1]++;
                }
            }
        }
        return arr;
    }
}
