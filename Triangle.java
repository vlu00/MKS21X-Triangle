public class Triangle {
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point P1, Point P2, Point P3) {
    Point a = new Point (P1);
    Point b = new Point (P2);
    Point c = new Point (P3);
    v1 = a;
    v2 = b;
    v3 = c;
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

  public Point getVertex(int index) {
    if (index == 0) {
      return v1;
    }
    if (index == 1) {
      return v2;
    }
    else return v3;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    }
    if (index == 1) {
      v2 = newP;
    }
    else
      v3 = newP;
  }

  public String toString() {
    return "Triangle: " + "A" + "(" + v1.getX() + ", " + v1.getY() + ")" + " " +
                          "B" + "(" + v2.getX() + ", " + v2.getY() + ")" + " " +
                          "C" + "(" + v3.getX() + ", " + v3.getY() + ")";
  }

}
