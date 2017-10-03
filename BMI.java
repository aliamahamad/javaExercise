/**
 * @(#)BMI.java
 *
 *
 * @author
 * @version 1.00 2014/12/15
 */

import java.util.Scanner;
public class BMI {


public class BMI2{
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
System.out.print("\nEnter name: ");
name[i] = in.next();
System.out.print("\nEnter weight: ");
weight[i] = in.nextInt();
System.out.print("\nEnter height: ");
height[i] = in.nextInt();
BMI = (weight[i] * BMI_CONSTANT/(height[i]*height[i]));
BMI1[i] = BMI;


System.out.println("Continue? Y or N");
answer = in.next();
switch(answer.toLowerCase()){

case "yes":
i++;
default:
break;
}
}
}
}
}