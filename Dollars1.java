/**
 * @(#)Dollars1.java
 *
 * @StudentName: Nurul 'Alia Salwa Binti Mahamad
 * @MatricNumber: 1539009
 * @Lecturer: En. Syarbaini bin Ahmad
 *
 * @version 1.00 2015/12/17
 */

import java.util.Scanner;

public class Dollars1 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter a value of dollars: ");
    	int value = input.nextInt();

    	int twenty = value / 20;
    	int ten = (value - (20 * twenty)) / 10;
    	int five = (value - (20 * twenty) - (10 * ten )) / 5;
    	int one = (value - (20 * twenty) - (10 * ten) - (5 * five)) / 1;

    	System.out.println("You have entered notes: " + twenty + " twenty, " + ten + " ten, " + five + " five, " + one + " one. ");

    }


}