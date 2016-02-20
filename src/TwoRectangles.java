import java.util.Scanner;

public class TwoRectangles {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter r1's center x-, y coordinates, width, and height: ");
    double r1x = input.nextDouble();
    double r1y = input.nextDouble();
    double r1w = input.nextDouble();
    double r1h = input.nextDouble();
    System.out.print("Enter r2's center x-, y coordinates, width, and height: ");
    double r2x = input.nextDouble();
    double r2y = input.nextDouble();
    double r2w = input.nextDouble();
    double r2h = input.nextDouble();
    
    double a = r1x + (r1w/2);
    double b = r1y + (r1h/2);
    double c = r1x - (r1w/2);
    double d = r1y - (r1h/2);
    double e = r2x + (r2w/2);
    double f = r2y + (r2h/2);
    double g = r2x - (r2w/2);
    double h = r2y - (r2h/2);
    
    if (e <= a && g >= c && f <= b && h >= d){
      System.out.println("r2 is inside r1");
      System.exit(0);
    } // if  
    
    if (a < g || d > f || b < h || h > b)
      System.out.println("r2 does not overlap r1");
    else
      System.out.println("r2 overlaps r1");
              
  } // main
} // TwoRectangles
