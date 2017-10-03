import java.util.Scanner;

public class AssignGrades {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

		int[] student = new int[4];
		int i;
		String grade;

    	System.out.print("Enter the number of students: ");
    	int NumberOfStudents = input.nextInt();

    	System.out.print("Enter "+NumberOfStudents+" students scores: ");
    	for (i=0;i<student.length;i++){

    	student[i] = input.nextInt();

		if (student[i] > 60)
    		grade = "A";

    	else if (student[i] > 50)
    		grade = "B";

    	else if (student[i] > 40)
    		grade = "C";

    	else if (student[i] > 30)
    		grade = "D";
    	else
    		grade = "F";



    	// Display result to user
		System.out.println("Student " +i+ " score is " +student[i]+ " and grade is "+grade);

    	}

	}

}


OUTPUT:-

