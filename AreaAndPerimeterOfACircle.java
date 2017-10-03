import java.util.Scanner;

public class AreaAndPerimeterOfACircle {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

    	double radius = 5.5;
    	double pai = 3.142;
    	double perimeter = 2 * radius * pai;
    	double area = radius * radius * pai;

    	System.out.println("Area of a circle: " +area);
    	System.out.println("Perimeter of a circle: " +perimeter);
    }


}