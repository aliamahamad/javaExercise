//To display financial application: calculate tips

	import java.util.Scanner;



public class gratuityrate {

    public static void main (String [] args) {

    	Scanner input = new Scanner (System.in);

    	System.out.print("Enter the subtotal and a gratuity rate: ");
    	double subtotalgratuity = input.nextDouble();

    	double total = (1.5 * subtotalgratuity);

    	System.out.print("total is " +total");

    }


}