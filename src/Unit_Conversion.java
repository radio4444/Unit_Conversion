import java.lang.reflect.Array;
import java.util.Scanner;

public class Unit_Conversion {
	public static void main(String args[]){
		
		String unitConversion[] = {"Length", "Mass", "Temperature", "Time", "Pressure"};
		//Intro of this program
		System.out.println("Welcome! This is a Unit Conversion program.");
		System.out.println("You can choose any one of the following unit: length, mass, temperature, time and pressure");
		System.out.print("Please type out one of them: ");
		Scanner userInput = new Scanner(System.in);
		String choose = userInput.nextLine();
		if (choose.equalsIgnoreCase(unitConversion[0])) {
			System.out.println("Yes, this is Length.");
			System.out.print("Currently, there is only one: Kilometer to Miles. \nEnter the kilometer number:");
			double kilometer_number = userInput.nextDouble();
			System.out.print("The answer is:  ");
			double kilo_to_miles = kilometer_number * 0.621371;
			System.out.printf("%f kilometer = %f miles \n",kilometer_number,kilo_to_miles );
			System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			
		}
		else if (choose.equalsIgnoreCase(unitConversion[1])) {
				System.out.println("Yes, this is Mass.");
				System.out.print("Currently, there is only one conversion: Kilogram to Pound. \nEnter the kilogram number:");
				double kilogram_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double kilogram_to_pound = kilogram_number * 2.20462;
				System.out.printf("%f Kilogram = %f Pound \n", kilogram_number, kilogram_to_pound);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else if (choose.equalsIgnoreCase(unitConversion[2])) {
				System.out.println("Yes, this is Temperature.");
				System.out.print("Currently, there is only one conversion: Fahrenheit to Celsius. \nEnter the Fahrenheit number:");
				double fahrenheit_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double fahrenheit_to_celsius = (fahrenheit_number - 32)* 5 / 9 ;
				System.out.printf("%f Fahrenheit = %f Celsius \n", fahrenheit_number, fahrenheit_to_celsius);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else if (choose.equalsIgnoreCase(unitConversion[3])) {
				System.out.println("Yes, this is Time. ");
				System.out.print("Currently, there is only one conversion: Minute to second. \nEnter the Minute number:");
				double minute_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double minute_to_second = minute_number * 60 ;
				System.out.printf("%f Minute = %f second \n", minute_number, minute_to_second);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else if (choose.equalsIgnoreCase(unitConversion[4])) {
				System.out.println("Yes, this is Pressure.");
				System.out.print("Currently, there is only one conversion: Bar to Pascal. \nEnter the Bar number:");
				double bar_number = userInput.nextDouble();
				System.out.print("The answer is:  ");
				double bar_to_pascal = bar_number * 100000 ;
				System.out.printf("%f Bar = %f Pascal \n", bar_number, bar_to_pascal);
				System.out.println("Great, so in order to choose other unit conversion, re run the program. Thank for using it.");
			}
		else System.out.print("No, this is wrong unit conversion. Re-run the program");
		
	}
}
