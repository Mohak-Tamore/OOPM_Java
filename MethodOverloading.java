import java.util.Scanner;
class Area
{
 void calArea(int x)
 {
  System.out.println("Area of square: "+(x*x));
 }
 void calArea(int l,int b)
 {
  int a;
  a = l*b;
  System.out.println("Area of rectangle: "+(l*b));
 }
 void calArea(double r)
 {
  System.out.println("Area of cirlcle: "+(3.14*r*r));
 }
}
class MethodOverloading
{
 public static void main(String args[])
 {
  int s;
  double f = 3.5;
  Area a1 = new Area();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter side of square: ");
  s = sc.nextInt();
  a1.calArea(s);
  a1.calArea(4,8);
  a1.calArea(f);
 }
}