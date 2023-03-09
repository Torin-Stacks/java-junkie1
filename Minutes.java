import java.util.Scanner;

	public class Minutes{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the number of minutes: ");
		double minutes = input.nextDouble();
		double hours = minutes / 60;
		double days = hours / 24;
		double years = days/ 365;
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	
	
	
	
	
	
	
	}
	}
