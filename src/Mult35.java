// Fisher Adelakin

// Project Euler Problem 1
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

public class Mult35 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(i < 1000) {
			if(i % 5 == 0 || i % 3 ==0){
				sum += i;
			}
			i++;
		}
		System.out.println("The sum of all multiples of 3 or 5 below 1000 is " + sum);
	}

}
