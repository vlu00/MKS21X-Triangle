public class Driver{
  public static void main(String[]args){
    Point A = new Point(1,1);
    Point B = new Point(1,2);
    System.out.println(A.distanceTo(B));
    System.out.println(Point.distanceBetween(A, B));
  }
}
