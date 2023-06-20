//Sophia Hostetler
//U27264415
// Energy Drink Consumption

public class EnergyDrinkConsumption
{  
   public static void main(String[] args)
   {
  
// constant and variable   
   final int TOTAL = 12467;
   int moreenergy = TOTAL/100 * 14 + 9;
   int citrus = TOTAL/100 * 64 + 42;
   
// output

System.out.println ("According to a survey of " + TOTAL +
                     " people:");
System.out.println (moreenergy + " customers surveyed purchased" + 
                     " one or more energy drinks per week.");
System.out.println (citrus + " customers surveyed preferred citrus" +
                     " flavored energy drinks. ");   
   
   
   
   
   }
}