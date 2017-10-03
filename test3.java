import java.util.*;
import java.io.*;
import java.lang.*;

public class test3{

		public static void main(String[] args){
			Scanner keyboard = new Scanner(System.in);

			System.out.println("Enter the name of the file");
			String fileName = keyboard.nextLine();
			File inputFile = new File(fileName);
			Scanner data = new Scanner(inputFile);


			//declaring that whatever the first number in the document is is how many indices the document has
			int scores[] = new int[data.nextInt()];

			while (data.hasNext())
				{
  					scores[i] = data.nextInt();
  					i++;
				}

					Arrays.sort(scores);


					//Highest and Lowest score
					System.out.println("Lowest score: " + scores[0]);
					System.out.println("Highest score: " + scores[(scores.length - 1)]);


					//Calculating Mean
					double gradesTotal = 0;
					for (i=0; i<scores.length; i++)
						{
  							gradesTotal = gradesTotal + scores[i];
						}

					//Finding how many number of A's, B's, etc
					int gradeA = 0;
					int gradeB = 0;
					int gradeC = 0;
					int gradeD = 0;
					int gradeF = 0;


					for (i=0; i<scores.length; i++)
						{
  							if (scores[i] >= 90)
  								{
    								gradeA++;
  								}
  							else if (scores[i] <= 89 && scores[i] >=80)
  								{
    								gradeB++;
  								}
  							else if (scores[i] <= 79 && scores[i] >=70)
  								{
    								gradeC++;
 								}
  							else if (scores[i] <= 69 && scores[i] >=60)
  								{
    								gradeD++;
  								}
  							else
  								{
    								gradeF++;
  								}
						}

						System.out.println("You have recieved " + gradeA + " A's, " + gradeB + " B's, " + gradeC + " C's, " + gradeD +
                   		" D's, and " + gradeF + " F's");
			}
	}



//    	if (Score >= 10-100)
    		System.out.print("grade is A");

    	else if (Score >= 20-100)
    		System.out.print("grade is B");

    	else if (Score >= 30-100)
    		System.out.print("grade is C");

    	else if (Score >= 40-100)
    		System.out.print("grade is D");

    	else
    		System.out.print("grade is F otherwise");
