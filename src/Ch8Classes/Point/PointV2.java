package Ch8Classes.Point;

/**
 * This is a blueprint for creating Point objects on a graph
 *
 */
public class PointV2 {
    //state (to store data of an object)
    public int x;
    public int y;

    public PointV2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public PointV2(){
        x = 0;
        y = 0;
    }
    //behaviors
    //setters
    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;

    }
   public void translate(int dx, int dy){
        x+=dx;
        y+=dy;
   }
   //getter
   public double distance(PointV2 other){

        return Math.sqrt(Math.pow(x-other.x,2) + Math.pow(y - other.y,2));
   }

   public String toString(){
        return "(" + x + ", " + y + ")";
   }



}
