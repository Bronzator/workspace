package Ch10ArrayList.ModMovieCollection;

public class Movies {
    public static void main(String[] args) {
        /**
         * Creates the dvd collection variable and adds the different dvds to the collection.
         */
        DVDCollection test = new DVDCollection();
        test.addDVD("Yes","me",2000,19.2,true);
        test.addDVD("Yes","me",2000,19.2,true);
        test.addDVD("Yes","me",2000,19.2,true);
        test.addDVD("Yes","me",2000,19.2,true);
        test.addDVD("Yes","me",2000,19.2,true);
        System.out.println(test.toString());
    }
}
