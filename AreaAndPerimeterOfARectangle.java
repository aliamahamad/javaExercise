import java.util.Scanner;

public class AreaAndPerimeterOfARectangle {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

    	double width = 4.5;
    	double height = 7.9;
    	double area = width * height;
    	double perimeter = width + width + height + height;

    	System.out.println("Area of a rectangle: " +area);
    	System.out.println("Perimeter of a rectangle: " +perimeter);
    }


}