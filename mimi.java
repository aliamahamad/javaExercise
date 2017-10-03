import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;

public class mimi{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int scores[] = new int[data.nextInt()];

		while (data.hasNext())
		{
			scores[i] = data.nextInt();
			i++;
		}

		//Finding how many number of A's, B's, etc
		int gradeA = 0;
		int gradeB = 0;
		int gradeC = 0;
		int gradeD = 0;
		int gradeF = 0;

		for (i=0; i<scores.length; i++)
		{
			if (scores[i] =< 99);
			{
				gradeA++;
			}
			else if (scores[i] <= 100 && scores[i] >= 20)
			{
				gradeB++;
			}
			else if (scores[i] <= 100 && scores[i] >= 30)
			{
				gradeC++;
			}
			else if (scores[i] <= 100 && scores[i] >= 40)
			{
				gradeD++;
			}
			else
			{
				gradeF++;
			}
		}

		System.out.println("your score " + gradeA + "A's, " + gradeB + "B's, " + gradeC + " C's, " + gradeD + "D's, and " + gradeF + " F's");
	}
}