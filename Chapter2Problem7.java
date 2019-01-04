// Chapter 2 Page 106
// Programming Challenges #7

import java.util.Scanner;

public class Chapter2Problem7
{
   public static void main(String[] args)
      {
      double purchase;
      double stateTax = 0.02; 
      double countryTax = 0.04;
      double totalTax = 0.06;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How much is your purchase?");
      purchase = keyboard.nextDouble();
      
      System.out.println("State Tax: $" + purchase*stateTax);
      System.out.println("Country Tax: $" + purchase*countryTax);
      System.out.println("Total Sales Tax: S" + purchase*totalTax);
      System.out.println("Total of Sale: $" + (purchase + purchase*totalTax));
     
      }
}