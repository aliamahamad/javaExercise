

import java.util.Scanner;

public class Pizza {

    public static void main (String args []) {

    	Scanner input = new Scanner(System.in);
    	int answer;

    	double[] pizza = new double[4];
       		 	pizza[0] = 17.90;
       		 	pizza[1] = 20.90;
       		 	pizza[2] = 16.90;
       		 	pizza[3] = 15.90;

       	double total;
       	double jumlah=0;
       	int nilai=0;

      System.out.println ("-----------------------------------------");
      System.out.println ("|        Welcome to Pizza Heart         |");
      System.out.println ("|                                       |");
      System.out.println ("| Your option                           |");
      System.out.println ("| 1. Menu selection                     |");
      System.out.println ("| 2. Make order                         |");
      System.out.println ("| 3. Add order                          |");
      System.out.println ("| 4. Total                              |");
      System.out.println ("| 5. Exit                               |");
      System.out.println ("-----------------------------------------");

      System.out.println("Please enter your selection:");
      answer= input.nextInt();



      while(answer >0 && answer<5){


      if (answer == 1 ){
      	System.out.println("");
      	System.out.println("--------------------------");
      	System.out.println("| Menu Selection         |");
      	System.out.println("| 1- Beef Pepperoni      |");
      	System.out.println("| 2- Seafood Delight     |");
      	System.out.println("| 3- Hawaiian Chicken    |");
      	System.out.println("| 4- Vegie Galore        |");
      	System.out.println("--------------------------");
        System.out.println("");
      }

       if (answer ==2){
       		int order;

      		System.out.println("------------");
      		System.out.println("|Make Order|");
      		System.out.println("------------");
      		System.out.println(" 1-Beef Pepperoni RM17.90 \n 2-Seafood Delight RM20.90 \n 3-Hawaiian Chicken RM16.90 \n 4-Vegie Galore RM15.90 ");
      		System.out.println("Please enter your order");
      		order = input.nextInt();


      		if (order ==1){
      			System.out.println("You have choose Beef Pepperoni RM17.90");
      			jumlah = pizza[0];
      		//	total = jumlah * nilai;

      			}
      			else if(order ==2){
      			System.out.println("You have choose Seafood Delight RM20.90");
      			jumlah = pizza[1];
      		//	total = jumlah * nilai;

      			}
      			else if(order ==3){
      			System.out.println("You have choose Hawaiian Chicken RM16.90");
      			jumlah =  pizza[2];
      		//	total = jumlah * nilai;

      			}
      			else if(order ==4){

      			System.out.println("You have choose Vegie Galore RM15.90");
      			jumlah =  pizza[3];
      		//	total = jumlah * nilai;
      			}

       }

       if(answer ==3){
       	    int quantity;
       	    System.out.println("");
       	    System.out.println("-----------");
      		System.out.println("|Add Order|");
      		System.out.println("-----------");
      		System.out.println("");

      		System.out.println("How many pizza you want to add?");
      		quantity = input.nextInt();
      		nilai = quantity;


      		if(quantity<10)
			System.out.println("Thank you, You have added "+quantity+ " pizza");


      		/*	else if (quantity >=10){
      	         System.out.println("Sorry, you cannot order more than 10 pizza");
      	         System.out.println("How many pizza you want to add?");
      	         quantity = input.nextInt();
      	         System.out.println("Thankyou you have added "+quantity+" pizza");


      				}*/
       }

       if(answer ==4){

		total = jumlah * nilai;

		    System.out.println("");
		    System.out.println("-----------");
      		System.out.println("|Total Order|");
      		System.out.println("-----------");
      		System.out.println("You have ordered ");
      		System.out.println("Thank you for buying from us");
			System.out.println("The total of your order RM"+total);

       }


	  System.out.println ("");
	  System.out.println ("-----------------------------------------");
      System.out.println ("|        Welcome to Pizza Heart         |");
      System.out.println ("|                                       |");
      System.out.println ("| Your option                           |");
      System.out.println ("| 1. Menu selection                     |");
      System.out.println ("| 2. Make order                         |");
      System.out.println ("| 3. Add order                          |");
      System.out.println ("| 4. Total                              |");
      System.out.println ("| 5. Exit                               |");
      System.out.println ("-----------------------------------------");
      System.out.println ("");

      System.out.println("Please enter your next selection:");
      answer= input.nextInt();

		continue;
      }
      if (answer ==5){
      		System.out.println ("");
      		System.out.println("Thankyou and have a nice day");
      }
    }
}