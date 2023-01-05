package Ch10ArrayList.ModMovieCollection;

public class DVD {
    /**
     * Sets up the instance variables for the DVD class.
     */
    private String title,director;
    private int year;
    private double cost;
    private boolean blueray;

    /**
     * Takes in the user input and sets the instance variables equal to the local variables.
     * @param title
     * @param director
     * @param year
     * @param cost
     * @param blueray
     */
    DVD(String title, String director, int year, double cost, boolean blueray){
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     *Prints the DVD information and has to different return statements for wheter there is blueray or not
     * @return
     */
    @Override
    public String toString() {
        if (blueray)
            return "$" + cost + " " + year + " " + title + " " + director + "\t" + "Blue-Ray";
        else
            return "$" + cost + " " + year + " " + title + " " + director;
    }
}
