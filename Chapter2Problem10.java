// Chapter 2 Page 107
// Programming Challenges #10

import java.util.Scanner;

public class Chapter2Problem10
{
   public static void main(String[] args)
   {
      int score1; 
      int score2;
      int score3;
      int averageScore;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What was your score from test 1?");
      score1 = keyboard.nextInt();
      
      System.out.print("What was your score from test 2?");
      score2 = keyboard.nextInt();
      
      System.out.print("What was your score from test 3?");
      score3 = keyboard.nextInt();
      
      System.out.println("Test 1 Score: " + score1);
      System.out.println("Test 2 Score: " + score2);
      System.out.println("Test 3 Score: " + score3);
      System.out.println("Average Score: " + (score1 + score2 + score3)/3); 
      
   }
}