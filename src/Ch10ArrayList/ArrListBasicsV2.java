package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrListBasicsV2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> data = new ArrayList<String>();
        File data0 = new File("data.txt");
        Scanner console = new Scanner(data0);
        while (console.hasNext()){
            data.add(console.next());
        }
        for (int i = 0; i < data.size();i++){
            System.out.println(data.get(i));
        }
        //Task 2 display all the words with plurals ending in s to be capitalized in the arraylist
        System.out.println("\n");
        for (int i = 0; i < data.size();i++){
            if (data.get(i).charAt(data.get(i).length()-1) == 's'){System.out.println(data.get(i).toUpperCase());}
            else
                System.out.println(data.get(i));
        }

        //Task 3 display all the words in reverse order and the content of the Array list in reverse order
        System.out.println("\n");
        for (int i = data.size()-1; i >= 0;i--){
            System.out.println(data.get(i));
        }
        //Task 4 remove any plurals
        for (int i = data.size()-1; i >= 0;i--){
            if (data.get(i).charAt(data.get(i).length()-1) == 's'){data.remove(i);}
        }
        System.out.println(data);
    }
}
