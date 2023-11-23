import java.util.Random;

import java.util.Scanner;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
 Random random = new Random();
     int minRange = 1;
        
int maxRange = 100;
   
int maxAttempts = 10;
  
int score = 0;

  
System.out.println("Welcome to the Number Guessing Game!");

    
 do {
        
    int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
  
          System.out.println("\nNew round! Guess the number between " + minRange + " and " + maxRange + ".");

        
 for (int attempts = 1; attempts <= maxAttempts; attempts++)
 {
          
      System.out.print("Attempt " + attempts + ": Enter your guess: ");
            
    int userGuess = scanner.nextInt();

                if (userGuess == generatedNumber)
 {
                 
   System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
    
 score += maxAttempts - attempts + 1;
                    break;
         
       }
 else if (userGuess < generatedNumber) 
{
               
     System.out.println("Too low. Try again.");
                } 
else
 {

                    System.out.println("Too high. Try again.");

                }

           
     if (attempts == maxAttempts)
 {

                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + generatedNumber);

                }
    
        }

      
      System.out.print("Do you want to play again? (yes/no): ");
       
     String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("no"))
 {

                break;

            }


        }
 while (true);


        System.out.println("Thanks for playing! Your total score is: " + score);
        scanner.close();


}    }
