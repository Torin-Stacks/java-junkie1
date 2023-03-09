import java.util.Scanner;

	public class Investment{
	
		public static void main(String[] args){
		Interest obj = new Interest();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate= input.nextDouble();
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12;
		double totalMonthlyInterestRate = Math.pow( (1 + monthlyInterestRate), (numberOfYears * 12) );
		double futureInvestmentValue = investmentAmount * totalMonthlyInterestRate;
		System.out.println("Accumulated value is " + futureInvestmentValue );
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	}
