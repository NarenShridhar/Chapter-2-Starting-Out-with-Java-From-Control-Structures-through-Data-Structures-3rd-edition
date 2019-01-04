// Chapter 2 Page 107
// Programming Challenges #13

import java.util.Scanner;

public class Chapter2Problem13
{
   public static void main(String[] args)
      {
         double mealCost; 
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("How much was your meal?");
         mealCost = keyboard.nextDouble();
         
         System.out.println("Tax: S" + mealCost*0.0675);
         
         System.out.println("Tip: $" + (mealCost + (mealCost*0.0675))*0.2);
         
         System.out.println("Total: $" + (mealCost + (mealCost*0.0675) + 
         (mealCost + (mealCost*0.0675))*0.2));
      }
}