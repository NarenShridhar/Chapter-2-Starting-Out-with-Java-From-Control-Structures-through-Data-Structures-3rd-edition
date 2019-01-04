// Chapter 2 Page 106-7
// Programming Challenges #9

import java.util.Scanner;

public class Chapter2Problem9
{
   public static void main(String[] args)
      {
         double milesDriven;
         double gallonsUsed;
         double mpg;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("How many miles did you drive?");
         milesDriven = keyboard.nextDouble();
         
         System.out.println("How many gallons of gas did you use?");
         gallonsUsed = keyboard.nextDouble();
         
         System.out.println("Your MPG is: " + milesDriven/gallonsUsed);

      }
}