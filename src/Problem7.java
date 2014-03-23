// Fisher Adelakin
// Project Euler Problem 7

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
// see that the 6th prime is 13

// What is the 10 001st prime number?

public class Problem7 {
	
	public static boolean isPrime(int n) {
		if(n == 2)
			return true;
		if(n % 2 == 0 || n == 1)
			return false;
		long limit = (long)Math.sqrt(n);
		for(int i = 3; i <= limit; i += 2)
			if(n % i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		int count = 1;
		int i = 3;
		while (count < 10001) {
			if(isPrime(i)) 
				count++;
			i += 2;
		}
		System.out.println(i - 2);
	}

}
