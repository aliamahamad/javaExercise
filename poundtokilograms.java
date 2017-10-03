//To convert pound to kilograms

	import java.util.Scanner;


public class poundtokilograms {

    public static void main (String [] args) {

    	Scanner input = new Scanner (System.in);

    	//Declare variable

    	System.out.print("Enter a number in pounds: ");
    	int pounds = input.nextInt();

    	int totalkilograms = (0.454 * pounds);

    	System.out.print("total pound in kilograms is: " +totalkilograms);	//total kilograms


    }


}