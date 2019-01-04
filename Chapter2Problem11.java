// Chapter 2 Page 107
// Programming Challenges #11

import java.util.Scanner;

public class Chapter2Problem11
{
   public static void main(String[] args)
      {
         double retailPrice;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("What was the retail price of your circuit board?");
         retailPrice = keyboard.nextDouble();
         
         System.out.print("Profit Earned: " + retailPrice*0.4);
      }
}