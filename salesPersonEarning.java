import java.util.Scanner;


public class salesPersonEarning {

    public static void main(String [] args) {

    	Scanner input = new Scanner (System.in);

    	double a=239.99, b=129.75, c=99.95;
    	double[] item = new double[3];

    	System.out.print("Enter the number of item1: ");
    	item[0]=input.nextDouble();
    	System.out.print("Enter the number of item2: ");
    	item[1]=input.nextDouble();
    	System.out.print("Enter the number of item3: ");
    	item[2]=input.nextDouble();

    	//calculate
    	double number1 = item[0]*a;
    	double number2 = item[1]*b;
    	double number3 = item[2]*c;

    	double total=((number1+number2+number3)*0.09)+200;

    	//Display result item
    	System.out.println("Your total salary: "+total);





    }


}