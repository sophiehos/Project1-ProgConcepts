//Sophia Hostetler
//U27264415
//Cookie Recipe

import java.util.Scanner;
public class IngredientAdjuster
{
   public static void main (String[] args )
   {
   
//constant and variable
   final double sugar = 1.5, butter = 1.0, flour = 2.75;
   double SugarCups, ButterCups, FlourCups, TotalCookies;
   
// User Input Statement
   Scanner scan = new Scanner(System.in);
   System.out.print ("Enter the number of cookies: ");
   TotalCookies = scan.nextDouble();
   System.out.println (" To make " + TotalCookies + " cookies, you will need: ");
 
 //Equation for 48 cookies
   SugarCups = TotalCookies/32; ButterCups = TotalCookies/48; FlourCups = TotalCookies/17.45;
   
 // Output statement for Recipe
   System.out.println (SugarCups + " cups of sugar");
   System.out.println (ButterCups + " cups of butter");
   System.out.println (FlourCups + " cups of flour");
  
  
  
  
  
   }
   
}