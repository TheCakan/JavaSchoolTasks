package geometry;

public class Point2D {

    private double x;
    private double y;

     public double distance(Point2D arg){
        double distance = Math.sqrt(Math.pow(this.x - arg.x, 2))
                                    + Math.pow((this.y - arg.y), 2);
        return distance;
     }


}
