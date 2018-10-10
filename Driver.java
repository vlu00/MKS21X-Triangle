public class Driver{
  public static void main(String[]args){
    Point A = new Point(1,1);
    Point B = new Point(1,2);
    Point C = new Point(B);
    Point D = new Point (2, 1);
    Point E = new Point (3, 1);
    System.out.println(C);
    System.out.println(A.distanceTo(B));
    System.out.println(Point.distanceBetween(A, B));

    Triangle ABC = new Triangle(A, B, C);
    Triangle ADE = new Triangle (A, D, E);
    Triangle DEF = new Triangle(0, 0, 0, 3, 4, 0);
    System.out.println(DEF.getPerimeter());
    System.out.println(DEF.getVertex(1));

    ADE.setVertex(0, D);
    System.out.println(ABC.getVertex(0));
    System.out.println(ADE.getVertex(0));

    System.out.println(ABC);
    System.out.println(ABC.toString());
  }
}
