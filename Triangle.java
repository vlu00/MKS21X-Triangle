public class Triangle {
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point P1, Point P2, Point P3) {
    v1 = P1;
    v2 = P2;
    v3 = P3;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    Point P1 = new Point (x1, y1);
    Point P2 = new Point (x2, y2);
    Point P3 = new Point (x3, y3);
    v1 = P1;
    v2 = P2;
    v3 = P3;
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) +
           v2.distanceTo(v3) +
           v3.distanceTo(v1);
  }

  public Point getVertex(int n) {

  }

  public void setVertex(int index, Point newP) {

  }

  public String toString() {
    return "Triangle: " + v1 + ""
  }
}
