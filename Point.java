public class Point{
  private double x;
  private double y;

  public  Point(Point P) {
    x = P.x;
    y = P.y;
  }
  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point P2) {
    return Math.sqrt(Math.pow(this.x - P2.x, 2) + Math.pow(this.y - P2.y, 2));
  }

  public static double distance(Point P1, Point P2) {
    return Math.sqrt(Math.pow(P1.x - P2.x, 2) +
                     Math.pow(P1.x - P2.y, 2));
  }

  public String toString() {
    return "(" + x +", " + y + ")";
  }
}
