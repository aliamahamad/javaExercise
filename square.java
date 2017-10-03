// To display area of square to user

	import java.util.Scanner;
//To display area of square to user

	import java.util.Scanner;


public class square {

    public static void main(String [] args) {

    	Scanner input = new Scanner (System.in);

    	System.out.print("Enter the length: ");
    	int length = input.nextInt();

    	System.out.print("Enter the width: ");
    	int width = input.nextInt();

    	double total = (length * width);//+total;

    	System.out.println("Your area of square is:"+total);

    }


}