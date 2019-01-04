// Chapter 2 Page 107
// Programming Challenges #14

import java.util.Scanner;

public class Chapter2Problem14
{
   public static void main(String[] args)
      {
         int numberOfMales;
         int numberOfFemales;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("How many males are registered for the class?");
         numberOfMales = keyboard.nextInt();
         
         System.out.print("How many females are registered for the class?");
         numberOfFemales = keyboard.nextInt();
         
         int totalNumberOfStudents = (numberOfMales + numberOfFemales);
         
         System.out.println("The total number of students is: " 
         + totalNumberOfStudents);
         
         System.out.println("The percentage of males in the class is: " + 
         numberOfMales/totalNumberOfStudents);
         
         System.out.println("The percentage of females in the class is: " +
         numberOfFemales/totalNumberOfStudents);
      }
}
