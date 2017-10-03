//To calculate new salary after 10% increasement

	import java.util.Scanner;

public class salary {

    public static void main(String [] args) {

    	Scanner input = new Scanner (System.in);

    	//current salary
    	System.out.println("Enter your current salary :");
    	double salary = input.nextDouble();

    	//newsalary
    	double current = (salary*10/100);
    	double newsalary = (current)+salary;

    	//display newsalary to user
    	System.out.println("New salary after 10% increasement :"+newsalary);
    }


}