import java.util.Scanner;
	
	public class Temperature{

		public static void main(String[] args){
	
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the amount of water in kg: ");
			double weight = input.nextDouble();
			System.out.print("Enter initial temperature T0 in celcius: ");
			double t0 = input.nextDouble();
			System.out.print("Enter final temperature T1 in celcius: ");
			double t1 = input.nextDouble();
			double energy = weight * (t1 - t0) * 4184;
			System.out.println("The energy needed is " + energy + " joules");
	
	
	}
	}
