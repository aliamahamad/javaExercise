SalesPersonEarnings.java

import java.util.Scanner;


public class SalesPersonEarnings {

    public static void main (String [] args) {

    	Scanner input = new Scanner (System.in);

    	double[] item = {239.99, 129.75, 99.95};
		double [] value = new double[3];
		int count = 1, i = 0;
		String yesOrNo;

    	// Sales person earnings
		do {
    	System.out.print("Enter value of item 1: ");
    	value[0] = input.nextDouble();
    	System.out.print("Enter value of item 2: ");
    	value[1] = input.nextDouble();
    	System.out.print("Enter value of item 3: ");
    	value[2] = input.nextDouble();




		// Calculate the value

		double earnings = 200+(value[0]*item[0]) + (value[1]*item[1]) + (value[2]*item[2]) * 0.09;
		count++;

		System.out.println("Total: "+earnings);

		// New user

		if (count >= 1)
		while (count <= 30){

			count++;
					}
			for (i=0; count<=30; i++){
				System.out.println("person " +i+ " is " +earnings);

			}

			System.out.println("Do you want to enter new user ?");
			yesOrNo=input.next();
			} while (yesOrNo.equals("yes"));
			System.out.println("Thank you.. please come again");



    }
 }



OUTPUT:

Enter value of item 1: 1
Enter value of item 2: 2
Enter value of item 3: 3
Total: 726.4765
Do you want to enter new user ?
yes
Enter value of item 1: 1
Enter value of item 2: 2
Enter value of item 3: 3
Total: 726.4765
Do you want to enter new user ?
no
Thank you.. please come again

Process completed.
