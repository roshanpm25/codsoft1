import java.util.Scanner;


public class GradeCalculator {

    public static void main(String[] args)
 {

        Scanner scanner = new Scanner(System.in);


        // Input: Take marks obtained in each subject

        System.out.println("Enter marks obtained (out of 100) in each subject:");

        int totalSubjects;

        int totalMarks = 0;

      
  // Calculate Total Marks and Average Percentage
 
       System.out.print("Enter the total number of subjects: ");
 
       totalSubjects = scanner.nextInt();


        for (int i = 1; i <= totalSubjects; i++) 
{
 
           System.out.print("Enter marks for Subject " + i + ": ");
 
           int subjectMarks = scanner.nextInt();
    
        totalMarks += subjectMarks;
   
     }


        double averagePercentage = (double) totalMarks / totalSubjects;

        // Grade Calculation
        char grade;
      
  if (averagePercentage >= 90) 
{
            grade = 'A';
        }
 else if (averagePercentage >= 80) 
{
            grade = 'B';
        }
 else if (averagePercentage >= 70) 
{
            grade = 'C';
        }
 else if (averagePercentage >= 60)
 {
            grade = 'D';
        }
 else
 {
            grade = 'F';
        }


        // Display Results
      
  System.out.println("\nResults:");
      
  System.out.println("Total Marks: " + totalMarks);
    
    System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

  
      scanner.close();
    }
}