import java.util.Scanner;

public class ExamScores
{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

   		private int[] scores = {99, 97, 85};

// No-argument constructor method
   		public ExamScores()
   		{
   // do nothing
   		}

// Display all the score values, one per line
   		public void displayAll()
   		{
      		for (int index = 0; index < scores.length; index++) {
         		System.out.println(scores[index]);
      }
   }

// Returns the total of the score values
   		public int sumAll()
   			{
      			int sum = 0;
      			for (int score : scores) {
         			sum = sum + score;
      }
      	return sum;
   }
}
}