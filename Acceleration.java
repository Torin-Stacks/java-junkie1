import java.util.Scanner;

	public class Acceleration{
		 
		 public static void main(String[] args){
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter starting velocity V0 in m/s: ");
		  int v0 = input.nextInt();
		  System.out.print("Enter ending velocity V1 in m/s: ");
		  int v1 = input.nextInt();
		  System.out.print("Enter time t in seconds: ");
		  int t = input.nextInt();
		  int acceleration = (v1 - v0) / t;
		  System.out.println("The average acceleration is " + acceleration + "m/s");
		 }
	
	
	}
