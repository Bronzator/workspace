package Ch10ArrayList.ModMovieCollection;

import java.util.ArrayList;

public class DVDCollection {
    /**
     * Declares the instance variables
     */
    private ArrayList<DVD> collection;
    private int count;
    private double totalcost;

    /**
     * Sets the instance variables equal to 0
     */
    public void DVDCollection(){
        ArrayList<DVD> collection = new ArrayList<DVD>(0);
        count = 0;
        totalcost = 0;
    }

    /**
     * Takes user input and applies it to the dvd variable and increments count and totalcost accordingly. Also adds the dvd variable to the collection Array list.
     * @param title
     * @param director
     * @param year
     * @param cost
     * @param blueray
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray){
        DVD dvd = new DVD(title,director,year,cost,blueray);
        collection.add(dvd);
        count++;
        totalcost+=cost;
    }

    /**
     * Extra method made to easily print out the collection array by putting it into a string
     * @param collection
     * @return
     */
    public String DVDs(ArrayList<DVD> collection){
        String holder = "";
        for (int i = 0;i < collection.size();i++){
            DVD dvd = collection.get(i);
            holder+=dvd.toString() + "\n";
        }
        return holder;
    }

    /**
     * Prints out all the information about the users movie collection
     * @return
     */
    public String toString(){
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n" +
                "My DVD Collection" + "\n" +
                "Number Of DVDs: " + count + "\n" +
                "Total Cost: $" + totalcost + "\n" +
                "Average Cost: $" + (double)totalcost/count + "\n\n" +
                "DVD List:" + "\n\n" + DVDs(collection) + "\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    }

}
