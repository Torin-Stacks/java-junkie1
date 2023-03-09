import java.util.Scanner;

	public class Interest{
	
		public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter balance and Annual interest rate e.g 5000 3(for 3%): ");
			double balance = input.nextDouble();
			double annualInterestRate = input.nextDouble();
			double monthlyInterestRate = balance * (annualInterestRate / 1200);
			System.out.println("The monthly interest is " + monthlyInterestRate);
		
		
		
		
		
		}
	
	
	
	}
