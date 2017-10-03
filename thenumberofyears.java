// To find the number if years

	import java.util.Scanner;


public class thenumberofyears {

    public static void main (String [] args) {

    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter the number of minutes: ");
    	double numberminutes = input.nextDouble();

		double seconds = (60);
		double minutes = (60);
    	double hours = (60);
    	double day = (24);

    	double jum = (minutes * hours * day);

    	System.out.print("minutes is approximately " +jum);
    	double total = input.nextDouble();

    }


}