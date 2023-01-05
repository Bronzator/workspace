package Ch8Classes.Point;

import Ch8Classes.Point.PointV4;

public class PointClientV4 {
    public static void main(String[] args) {
        //TASK: modify your toString method in PointV4 such that, when you print the object, it prints the name of the object in addition to the coordinates

        //Adam (-1, -1)
        PointV4 adam = new PointV4("Adam", -1, -1); //instantiation a Point object at (-1,-1)
        PointV4 marcus = new PointV4("Marus", -1, 2); //instantiates a Point object at (-1,2)
        PointV4 rosemary = new PointV4("Rosemary"); //instantiates a Point object at (0,0)

        System.out.println(marcus.distance(rosemary));

        System.out.println(PointV4.distance(marcus, rosemary));

        PointV4 ellie = new PointV4(); //point named origin at (0,0)
        ellie.rename("Ellie"); //allow the user to rename

        System.out.println(ellie);

        PointV4 felix = new PointV4(1, 1);
        System.out.println(felix); //says null's location is (1,1)

        rosemary.setLocation(3,3);
        System.out.println(adam);
        System.out.println(marcus);
        System.out.println(rosemary);
        //System.out.println("Rosemary's location is: " + rosemary);
        System.out.println(marcus.distance(adam));

        System.out.println(PointV4.getPointCount());
    }
}