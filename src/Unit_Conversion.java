import java.lang.reflect.Array;
import java.util.Scanner;

public class Unit_Conversion {
	public static void main(String args[]){
		/*
		Do 5 different scientific to English.
		Length, mass, temperature, time and pressure
		Try to create if-else statement.
			Ask the user, what they want to do
			Formula for the conversion (dont think, I need function)
		 */
		String unitConversion[] = {"Length", "Mass", "Temperature", "Time", "Pressure"};
		//Intro of this program
		System.out.println("Welcome! This is a Unit Conversion program.");
		System.out.println("Alright, so in order to use this program, you have to go through this steps:\n" +
				"Step 1: Choose one of the following unit conversion: Length, Mass, Temperature, Time and Pressure\n" +
				"Step 2: Now press enter x many times to choose that unit conversion and then type out that unit conversion. \n" +
				"For instance: for first one, just type out length\n" +
				"For second one, press enter once and then type mass.\n" + "Step 3: Follow the next instruction for each unit conversion");
		System.out.print("Enter the unit conversion: ");
		Scanner userInput = new Scanner(System.in);
		if (userInput.nextLine().equalsIgnoreCase(unitConversion[0])) {
			System.out.println("Yes, this is Length.");
			System.out.println("Currently, there is only one: Kilometer to Miles. Enter the kilometer");
			double kilometer_number = userInput.nextDouble();
			System.out.print("The answer is:  ");
			double kilo_to_miles = kilometer_number * 0.621371;
			System.out.printf("%f kilometer = %f miles \n",kilometer_number,kilo_to_miles );
			System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			
		}
		else if (userInput.nextLine().equalsIgnoreCase(unitConversion[1])) {
				System.out.println("Yes, this is Mass.");
				System.out.println("Currently, there is only one conversion: Kilogram to Pound\n . Enter the kilogram:");
				double kilogram_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double kilogram_to_pound = kilogram_number * 2.20462;
				System.out.printf("%f Kilogram = %f Pound \n", kilogram_number, kilogram_to_pound);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else if (userInput.nextLine().equalsIgnoreCase(unitConversion[2])) {
				System.out.println("Yes, this is Temperature.");
			System.out.println("Currently, there is only one conversion: Fahrenheit to Celsius\n . Enter the Fahrenheit:");
				double fahrenheit_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double fahrenheit_to_celsius = (fahrenheit_number - 32)* 5 / 9 ;
				System.out.printf("%f Fahrenheit = %f Celsius \n", fahrenheit_number, fahrenheit_to_celsius);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else if (userInput.nextLine().equalsIgnoreCase(unitConversion[3])) {
				System.out.println("Yes, this is Time. ");
			System.out.println("Currently, there is only one conversion: Minute to second\n . Enter the Minute:");
				double minute_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double minute_to_second = minute_number * 60 ;
				System.out.printf("%f Minute = %f second \n", minute_number, minute_to_second);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else if (userInput.nextLine().equalsIgnoreCase(unitConversion[4])) {
				System.out.println("Yes, this is Pressure.");
			System.out.println("Currently, there is only one conversion: Bar to Pascal\n . Enter the Bar:");
				double bar_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double bar_to_pascal = bar_number * 100000 ;
				System.out.printf("%f Bar = %f Pascal \n", bar_number, bar_to_pascal);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else System.out.print("No, this is wrong unit conversion. Re-run the program");
		
	}
}
