import java.util.Scanner;

	public class SumOfDigit{
	
		public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number between 0 and 1000: ");
			int number = input.nextInt();
			int lastNumber = number % 10;
			int firstTwoNumbers = number / 10;
			int middleNumber = firstTwoNumbers % 10;
			int firstNumber = firstTwoNumbers / 10;
			int sum = lastNumber + middleNumber + firstNumber;
			System.out.println("The sum of the digits is " + sum);
		
		
		}
		
		
		}
		
