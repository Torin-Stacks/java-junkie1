import java.util.Scanner;
	
	public class Area{
		public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter value for side 1: ");
			double side1 = input.nextDouble();
			System.out.print("Enter value for side 2: ");
			double side2 = input.nextDouble(); 
			System.out.print("Enter value for side 3: ");
			double side3 = input.nextDouble();
			double sum = side1 + side2 + side3;
			double s = sum / 2;
			double areaNonSquareRoot = s*(s - side1)*(s - side2)*(s - side3);
			double area = Math.sqrt(areaNonSquareRoot);
			System.out.println("The area of the triangle is " + area);
		
		}
	
	}
