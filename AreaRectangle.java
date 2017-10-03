import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter height of rectangle: ");
    	double height = input.nextDouble();

    	System.out.print("Enter base of rectangle: ");
    	double base = input.nextDouble();

    	double total = base * height;

    	System.out.print("Area of rectangle is " +total);
    }


}