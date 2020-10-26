import java.util.Scanner;
import java.util.InputMismatchException;
public class temp {
   public static void main(String[] args) {
   double currentTemp;
   int selection;
   boolean correct = false;
   
   while(!correct) {
   try {   
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the current temperature >>");
      currentTemp = keyboard.nextInt();
      
      System.out.println("Convert to Celsius (1), Kelvin (2) or Newton (3)?");
      selection = keyboard.nextInt();
      
      // Switch statement for selection
          switch(selection) {
            case 1:
               currentTemp = (currentTemp - 32) * 5/9;
               System.out.println("Current temperature in Celsius is " + Math.round(currentTemp));
               break;
            case 2:
               currentTemp = (currentTemp - 32) * 5/9 + 273.15;
               System.out.println("Current temperature in Kelvin is " + Math.round(currentTemp));
               break;
            case 3:
               currentTemp = (currentTemp - 32) * 0.18333;
               System.out.println("Current temperature in Newton is " + Math.round(currentTemp));
               break;
            }
            
            // Catch InputMismatchException
          } catch(InputMismatchException e) {
            System.out.println("Invalid data type. Please enter a whole number.");
       } 
     }  
   }
}