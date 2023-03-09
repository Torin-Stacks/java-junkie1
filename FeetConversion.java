import java.util.Scanner;
	
	public class FeetConversion{
		
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value in feet: ");
		double number = input.nextDouble();
		double feetInMeters = number * 0.305;
		System.out.println(number + " feet is " + feetInMeters + " meters");
		
		}
	
	
	
	
	
	}
