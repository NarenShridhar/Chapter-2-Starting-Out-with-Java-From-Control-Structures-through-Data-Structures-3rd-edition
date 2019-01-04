// Chapter 2 Page 106
// Programming Challenges #8

import java.util.Scanner;

public class Chapter2Problem8
{
   public static void main(String[] args)
      {
         double cookie;
      
         Scanner keyboard = new Scanner(System.in);
      
         System.out.println("How many cookies did you eat?");
         cookie = keyboard.nextDouble();
         
         System.out.println("You consumed " + cookie*75 + " calories.");
      }
}