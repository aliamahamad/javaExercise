//To convert feet in meters

	import java.util.Scanner;


public class feetinmeters {

    public static void main (String [] args) {

    	Scanner input = new Scanner (System.in);

    	//Declare variable

    	System.out.print("Enter a value for feet: ");
    	double feet = input.nextDouble();

		double totalfeet = (0.305 * feet);

    	System.out.print("total feet " +totalfeet); //total feet
    }


}
