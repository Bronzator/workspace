package Ch8Classes.Point;

import Ch8Classes.Point.Point;

public class PointClientV1 {
    public static void main(String[] args) {
        // -1 , -1
        Point adam = new Point(-1,-1);

        Point seb = new Point(-1,2);

        System.out.println("Sebastians location is " + seb.x+" "+ seb.y + "\n Adams locaton is " + adam.x+" "+adam.y + "\n The distance from each other is " + seb.distance(adam));
    }
}
