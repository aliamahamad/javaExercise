import java.util.Scanner;

public class TwoIntegers {

    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);

    	int sum, product;

    	System.out.println("Enter two integers: ");
    	int num1 = input.nextInt();
    	int num2 = input.nextInt();

    	sum = num1 + num2;
    	product = num1 * num2;

    	System.out.println("Sum is " +sum);
    	System.out.println("Product is " + product);

    	if (num1 > num2)
    		System.out.println(+num1+ " is larger ");
    	else
    		System.out.println(" This number is equal ");
    }


}