package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrListBasics {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> dataO = new ArrayList<String>();
        File data = new File("data.txt");
        Scanner console = new Scanner(data);
        while (console.hasNext()){
           dataO.add(console.next());
        }
        System.out.println(dataO);
    }
}
