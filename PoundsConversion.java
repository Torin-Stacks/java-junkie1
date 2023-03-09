import java.util.Scanner;

	public class PoundsConversion{
	
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double number = input.nextDouble();
		double kilogram = number * 0.454;
		System.out.println(number + " pounds is " + kilogram + " kilograms");
		}
	
	
	
	
	
	}
