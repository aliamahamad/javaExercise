//The purpose of this program is to get input from user and display back

	  import java.util.Scanner;



public class studentInfo {

    public static void main (String [] args){
    	Scanner input = new Scanner (System. in);

    //Variable declaration

    	String name, ic;
    	int phone;
    	float pointer;


    	System.out.print("Enter name:");	//Get input from user
    	name = input.next ();
    	System.out.print("Enter ic number:");
    	ic = input.next ();
		System.out.print("Enter phone number:");
    	phone = input.nextInt ();
    	System.out.print("Enter pointer:");
    	pointer = input.nextFloat ();


    	//Display output

    	System.out.println("Ypur name : "+name);
    	System.out.println("Your IC number :"+ic);
    	System.out.println("Your phone number: "+phone);
    	System.out.println("Enter pointer : "+pointer);

    		  }


}