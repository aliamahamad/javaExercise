import java.util.Scanner;

public class SalesPersonEarnings {

    public static void main (String [] args) {

    	Scanner input = new Scanner( System.in );



    	System.out.print("item per week: ");
    	double sold = input.nextDouble();

    	double salespersonreceive = sold*0.09;

    	System.out.print("Enter quantity item: ");
    	int quantity1 = input.nextInt();
    	System.out.print("Enter quantity item: ");
    	int quantity2 = input.nextInt();
    	System.out.print("Enter quantity item: ");
    	int quantity3 = inpur.nextInt();

    	// New User

    	int[] person = new int[40];

    	for(ctr=1; ctr<=41; ctr++){
    		System.out.print("Enter person " + ctr );
    		person[ctr-1] =input.nextInt();
    	}
    	for(ctr=0; ctr<=39; ctr++)
    		System.out.println(person[ctr]);
    	}

    	// One sales person's item sold last week and calculate and display that salesperson earnings

    	int input1 = input.nextInt();
    	int input2 = input.nextInt();
    	int input3 = input.nextInt();
    	salesperson earnings = 200 + ((quantity1 + quantity2 + quantity3) * 0.09);
    	}


