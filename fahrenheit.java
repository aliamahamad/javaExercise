// To convert celcius to fahrenheit

	import java.util.Scanner;


public class fahrenheit {

    public static void main (String [] args) {

    	Scanner input = new Scanner (System.in);

    	//Declare variable

    	System.out.print("Enter a degree in celcius: ");
    	double celcius = input.nextDouble();

		double fahrenheit = (9.0 / 5) * celcius + 32;

    	System.out.print("43 celcius is " +fahrenheit);


    }


}