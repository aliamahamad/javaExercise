//To display total charges for parking

	import java.util.Scanner;


public class totalcharges {

    public static void main (String [] args) {

    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter total hours: ");
    	int hours = input.nextInt();

    	int parking = hours*2;

    	System.out.print("Total charges of parking: "+parking);
    }


}