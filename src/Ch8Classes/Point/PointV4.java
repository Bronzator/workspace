/**
 * This program is a template (blueprint) for creating Point objects on a cartesian coordinate. This version
 * contains, overloaded constructors, a toString method to print the object and encapsulates the fields so that they're restricted.
 * @author :
 * @since : Tuesday, Nov. 1, 2022
 * @version: 4.0
 */

package Ch8Classes.Point;

public class PointV4 {
    //state (to store the data of an object)
    //synonyms - fields, instance variables, state fields
    //private visibility forces encapsulation
    private int x;
    private int y;
    private String name;

    //static fields reside at the class level - meaning an object does not have access to it
    private static int pointCount;

    //constructor(s) - the only job is to initialize all the fields
    //a constructor gets called implicitly when an object is instantiated used the keyword new
    //a constructor does NOT have a return type
    public PointV4(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        pointCount++;
    }

    //a default constructor is deleted when you create your own constructor with parameters
    public PointV4() { //default constructor
        this("origin", 0, 0);
    }

    public PointV4(int x, int y) {
        this(null, x, y);
    }

    public PointV4(String name) {
        this(name, 0, 0);
    }

    //behaviors (methods that you can call to update the state)
    //setters (mutator) - are void methods (for example, deposit money)
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void rename(String name) {
        this.name = name;
    }

    //getters (accessor) - are non-void methods that return some value
    public double distance(PointV4 other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    //static methods reside at the class level - meaning an object does not have access to it
    public static double distance(PointV4 a, PointV4 b) {
        return a.distance(b);
    }

    public static int getPointCount() {
        return pointCount;
    }

    //this method gives me read-only access to the field
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //the toString method is called implicitly (like the constructor), when an object is being printed
    public String toString() {
        if (name != null) {
            return name + "'s location is: " + "(" + x + ", " + y + ")";
        } else {
            return "The point is at location is: " + "(" + x + ", " + y + ")";
        }
    }
}