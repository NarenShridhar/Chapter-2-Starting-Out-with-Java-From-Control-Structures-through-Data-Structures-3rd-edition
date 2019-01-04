// Chapter 2 Page 107
// Programming Challenges #12

import java.util.Scanner;

public class Chapter2Problem12
{
   public static void main(String[] args)
      {
         String favoriteCity;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("What is your favorite city?");
         favoriteCity = keyboard.nextLine();
         
         System.out.println("The number of characters in this city is: " +
         favoriteCity.length());
         
         System.out.println(favoriteCity.toUpperCase());
         
         System.out.println(favoriteCity.toLowerCase());
         
         System.out.println(favoriteCity.charAt(0));
      }
}