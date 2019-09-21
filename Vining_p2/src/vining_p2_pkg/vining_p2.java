package vining_p2_pkg;
import java.util.Scanner;

public class vining_p2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int unitSelection;
		int userWeight;
		double userHeight;
		double bmi;
		
		String heightUnit;
		
		String weightUnit;
		
		System.out.println("Please specify units as standard(1) or meteric(2): ");
		
		unitSelection = in.nextInt();
		
		if (unitSelection == 1)
		{
			heightUnit = "inces";
			weightUnit = "pounds";
		}
		else
		{
			heightUnit = "centimeters";
			weightUnit = "kilograms";
		}
		
		System.out.printf("Please enter your weight in %s:\n", weightUnit);
		userWeight = in.nextInt();
		
		System.out.printf("Please enter your height in %s:\n", heightUnit);
		userHeight = in.nextInt();
		
		
		if (unitSelection == 1)
		{
			bmi = (703 * userWeight) /(Math.pow(userHeight, 2));
		}
		else
		{
			userHeight /= 100;
			bmi = (userWeight) /(Math.pow(userHeight, 2));
		}
		
		System.out.println("");
		
		System.out.printf("Your BMI is: %.1f\n\n\n", bmi);
		
		System.out.printf("%27s\n", "BMI Categories");
		for (int i = 0; i < 39; ++i)
		{
			System.out.print("-");
		}
		
		System.out.printf("\n| %-15s | %-18s|\n", "Under weight", "BMI less than 18.5");

		for (int i = 0; i < 38; ++i)
		{
			System.out.print("-");
		}
		
		System.out.printf("\n| %-15s | %-18s|\n", "Normal Weight", "BMI 18.5 to 24.9");
		
		for (int i = 0; i < 39; ++i)
		{
			System.out.print("-");
		}
		
		System.out.printf("\n| %-15s | %-18s|\n", "Overweight", "BMI 25-29.9");
		
		for (int i = 0; i < 39; ++i)
		{
			System.out.print("-");
		}
		
		System.out.printf("\n| %-15s | %-18s|\n", "Obesity", "BMI 30 or greater");
		
		for (int i = 0; i < 39; ++i)
		{
			System.out.print("-");
		}
	}

}
