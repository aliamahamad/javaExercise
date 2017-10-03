/**
 * @(#)BMI2.java
 *
 *
 * @author
 * @version 1.00 2014/12/16
 */

import java.util.Scanner;
public class BMI2 {

public static void main(String[] args){
int Max_Value,Min_Value,BMI;


String name[] = new String[100];
int BMI1[] = new int[100];
int weight[] = new int[100];
int height[] = new int[100];

final int BMI_CONSTANT = 703;
double total,average;
Scanner in = new Scanner(System.in);
int i;
int max = 100;

String answer;


for(i = 0; i < 10;){
System.out.print("Please Enter your name: ");
name[i] = in.next();
System.out.print("Please Enter your weight: ");
weight[i] = in.nextInt();
System.out.print("Please nEnter height: ");
height[i] = in.nextInt();
BMI = (weight[i] * BMI_CONSTANT/(height[i]*height[i]));
BMI1[i] = BMI;


     System.out.printf("Your Body Mass Index is " + bmi);

     if (bmi < 16)
       System.out.println("You are seriously underweight");
     else if (bmi < 18)
       System.out.println("You are underweight");
     else if (bmi < 24)
       System.out.println("You are normal weight");
     else if (bmi < 29)
       System.out.println("You are overweight");
     else if (bmi < 35)
       System.out.println("You are seriously overweight");
     else
       System.out.println("You are gravely overweight");
  }
}


System.out.println("Your BMI is: "+ BMI1[0] + " and " + BMI1[1] + " and " + BMI1[2]);
total = BMI1[0] + BMI1[1] + BMI1[2];
System.out.println(total);
average = total / 3;
System.out.print("The average BMI is :" + average + " and the max BMI is " + Max_Value + " and the min value is: " + Min_Value);

}

}




