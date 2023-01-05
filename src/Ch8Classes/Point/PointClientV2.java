package Ch8Classes.Point;

public class PointClientV2 {
    public static void main(String[] args) {
        // -1 , -1
        PointV2 adam = new PointV2(-1,-1);
        PointV2 rosemary = new PointV2();
        PointV2 seb = new PointV2(-1,2);

        System.out.println("Sebastians location is " + seb.toString() + "\n Adams locaton is " + adam.toString() +
                " " + rosemary.toString() + "\n The distance from Adam and Sebastian is " + seb.distance(adam));
    }
}
