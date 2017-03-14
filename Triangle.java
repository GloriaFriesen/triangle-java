import java.io.Console;
public class Triangle {
  public static void main (String[] args) {
    Console myConsole = System.console();
    while(true){
      System.out.println("Welcome to the triangle. Please enter 3 sides:");
      System.out.println("Side 1: ");
      int side1 = Integer.parseInt(myConsole.readLine());
      System.out.println("Side 2: ");
      int side2 = Integer.parseInt(myConsole.readLine());
      System.out.println("Side 3: ");
      int side3 = Integer.parseInt(myConsole.readLine());
      if ( side3 <= side1 + side2 && side1 <= side2 + side3 && side2 <= side1 + side3) {
        if (side1 == side2 && side2 == side3){ //equalateral
          System.out.println("Equalateral");
        } else if (side1 == side2 && side2 != side3 || side1==side3 && side1!=side2 || side2==side3 && side3!=side1) { //isosceles
          System.out.println("Isosceles");
        } else if (side1!=side2 && side1!=side3 && side2!=side3) { //scalene
          System.out.println("Scalene");
        }
      } else {
        System.out.println("Not a triangle");
      }
    System.out.println("---------------------------------------------");
    }
  }
}
