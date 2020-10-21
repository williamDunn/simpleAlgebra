package maththing;

import java.util.Scanner;

public class domath {

	public static void main(String[] args) {
		System.out.println("What variable would you like to use?");
		
		Scanner sc = new Scanner(System.in);
		
		double variable = 3;
		
		variable = sc.nextDouble();
		
		doMath(variable);
		
		sc.close();

	}
	
	public static double doMath(double var) {
		double result1;
		double result2;
		double sum;
		
		result1 = 8 - var;
		
		result1 = Math.pow(result1, 2);
		
		result2 = var - 2;
		
		result2 = Math.pow(result2, 3);
		
		sum = result1 - result2;
		
		System.out.println(sum);
		
		return sum;	
	}

}
