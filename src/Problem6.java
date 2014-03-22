// Fisher Adelakin
// Project Euler Problem 6

import java.lang.Math;

public class Problem6 {
	
	public static void main(String[] args) {
		System.out.println(squareOfSum() - sumOfSquares());
	}
	
	public static double sumOfSquares() {
		double sum = 0;
		
		for(double i = 0; i <= 100; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	
	public static double squareOfSum() {
		double sum = 0;
		
		for(double i = 1; i <= 100; i++) {
			sum += i;
		}
		sum = Math.pow(sum, 2);
		return sum;
	}
}
