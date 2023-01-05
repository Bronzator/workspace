package Ch8Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * In this project I have made the game hangman where the user is trying to guess an automated word. The user has 6 tries.
 */
public class SebastianLassanderHangman {
    /**
     * This is the main method that runs all the code and essentially holds everything.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        intro();
        int wins = 0;
        int totalGames = 0;
        Scanner console = new Scanner(System.in);
        boolean again = true;

        while (again) {
            String arr[][] = {{"+","-","-","+"," "},
                    {"|"," "," ","|"," "},
                    {"|"," "," "," "," "},
                    {"|"," "," "," "," "},
                    {"|"," "," "," "," "},
                    {"|"," "," "," "," "},
                    {"+","-","-","-"," "}};

            String guessed[] = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
            String word = word(console);
            String blankWord = "";
            for (int i = 0; i < word.length(); i++) {
                blankWord += '.';
            }


            int chances = 0;
            String blankWord2 = blankWord;

            while (chances != 6) {
                System.out.println("Letters guessed so far: " + Arrays.toString(guessed));
                System.out.println(blankWord);
                hangManPrint(arr);


                System.out.println("Guess a letter: ");
                String letter = console.nextLine();

                for (int i = 0; i < 26; i++) {
                    if (guessed[i] == " ") {
                        guessed[i] = letter;
                        i = 26;
                    }
                }
                blankWord2 = blankWord;
                blankWord = (correctOrWrong(word, letter, blankWord));
                if (blankWord2.equals(blankWord)) {
                    chances++;
                    hangManUpdate(chances, arr);
                    if (chances == 6) {
                        System.out.println("You lost! \nTry again!\nThe word was: " + word + "\nDo you want to go again?(y/n)");
                        totalGames++;
                        if (console.nextLine().equals("y")){
                            chances = 6;
                        }
                        else{
                            System.out.println("Overal Stats \ntotal games: " + totalGames + "\ntotal wis: " + wins + "\nwin percentage: " + (double)(wins/totalGames)*100);
                            again = false;
                        }
                    }
                }
                if (blankWord.equals(word)) {
                    System.out.println("You won! The word was: " + word + "\nDo you want to go again?(y/n)");
                    totalGames++;
                    wins++;
                    if (console.nextLine().equals("y")){
                        chances = 6;
                    }
                    else{
                        System.out.println("Overal Stats \ntotal games: " + totalGames + "\ntotal wis: " + wins + "\nwin percentage: " + (double)(wins/totalGames)*100);
                        again = false;
                    }
                }
            }

        }
    }

    /**
     * This method updates the hangMan array to the proper stage based on the amount of times the user made a mistake.
     * @param chances
     * @param arr
     */
    public static void hangManUpdate(int chances, String[][] arr){
        if (chances == 1){
            arr[2][3] = "O";
        }
        else if(chances == 2){
            arr[3][3] = "|";
        }
        else if(chances == 3){
            arr[3][2] = "-";
        }
        else if(chances == 4){
            arr[3][4] = "-";
        }
        else if(chances == 5){
            arr[4][4] = "_";
        }
        else{
            arr[4][2] = "_";
        }
    }

    /**
     * Prints the hangman array
     * @param arr
     */
    public static void hangManPrint(String arr[][]){
        for (int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * If the letter is within the word, it will add it to the blank word so the user can see their progression
     * @param word
     * @param letter
     * @param blankWord
     * @return
     */
    public static String correctOrWrong(String word,String letter, String blankWord){
        for(int i = 0;i < word.length();i++){
            if ((String.valueOf(word.charAt(i)).equals(letter) & !(String.valueOf(blankWord.charAt(i)).equals(letter)))){
                blankWord = blankWord.substring(0,i) + letter + blankWord.substring(i+1);
            }
        }
        return blankWord;
    }

    /**
     * Does a basic intro to the project
     */
    public static void intro(){
        System.out.println("Welcome to my version of Hangman! \nHow this works is that a random word will be chosen and you will have to try and guess all the letters" +
                " that spell out the word before all the body parts are added to the hangman!\nGood Luck!");
    }

    /**
     * Opens the hangman file and randomlly choses a word for the user to guess. 
     * @param console
     * @return
     * @throws FileNotFoundException
     */
    public static String word(Scanner console) throws FileNotFoundException {
        File wordsFile = new File("hangman.txt");
        Scanner words = new Scanner(wordsFile);
        int num = Integer.parseInt(words.nextLine());
        Random random = new Random();
        String word = null;
        for(int i = 0; i <= random.nextInt(num);i++){
            word = (words.nextLine());
        }
        return word;
    }
}
