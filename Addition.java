import java.util.Scanner;

	public class Addition{
	
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int oddNumber = 0;
			int evenNumber = 0;
			
			System.out.print("please enter a number: ");
			int number1 = input.nextInt();
			if(number1 % 2 == 0){
			evenNumber = evenNumber + number1;
			}
			else {oddNumber = oddNumber + number1;}
			System.out.print("please enter a number: ");
			int number2 = input.nextInt();
			if(number2 % 2 == 0){
			evenNumber = evenNumber + number2;
			}
			else {oddNumber = oddNumber + number2;}
			System.out.print("please enter a number: ");
			int number3 = input.nextInt();
			if(number3 % 2 == 0){
			evenNumber = evenNumber + number3;
			}
			else {oddNumber = oddNumber + number3;}
			System.out.print("please enter a number: ");
			int number4 = input.nextInt();
			if(number4 % 2 == 0){
			evenNumber = evenNumber + number4;
			}
			else {oddNumber = oddNumber + number4;}
			System.out.print("please enter a number: ");
			int number5 = input.nextInt();
			if(number5 % 2 == 0){
			evenNumber = evenNumber + number5;
			}
			else {oddNumber = oddNumber + number5;}
			System.out.println("The sum of even numbers = " + evenNumber);
			System.out.println("The sum of odd numbers = " + oddNumber);
		
		
		
		}
	
	
	
	}
