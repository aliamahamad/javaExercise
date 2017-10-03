import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter the radius and length of a cylinder: ");
    	double radius = input.nextDouble();
    	double length = input.nextDouble();

    	double pai = 3.142;
    	double area = radius * radius * pai;
    	double volume = area * length;

    	System.out.println("The area is " + area);
    	System.out.println("The volume is " + volume);
    }


}