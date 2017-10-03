/*  Programmer: Micheal W. Smith

    Date:       September 27, 2008

    Program:    Code a Java program that allows the user to enter

                five test scores and outputs the average

*/



import java.util.Scanner; //allows for user to enter input into the program ( I think :+ /)



public class TestScores{

    public static void main (String [] args);



    {

        Scanner keyboard = new Scanner(System.in);



        //Variables for Program



        double TestScore1 = 0.0;

        double TestScore2 = 0.0;

        double TestScore3 = 0.0;

        double TestScore4 = 0.0;

        double TestScore5 = 0.0;

        double averageScore;





        //Prompts for user input



        System.out.println("Please enter Test Score 1: ");



        System.out.println("Please enter Test Score 2: ");



        System.out.println("Please enter Test Score 3: ");



        System.out.println("Please enter Test Score 4: ");



        System.out.println("Please enter Test Score 5: ");



        System.out.println("Your average is: ");

        averageScore = (TestScore1 + TestScore2 + TestScore3

        + TestScore4 + TestScore5 / 5);
     }
}
