// Fisher Adelakin
// Project Euler Problem 10

public class Problem10 {

	public static void main(String[] args) {
		long sum = 0;
		int n = 2000000;
		for(int i = 2; i < n; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(long n) {
		boolean isPrime = true;
		for(int i = 2; i <= Math.round(Math.sqrt(n)) && isPrime; i++) {
			isPrime = !(n % i == 0);
		}
		return isPrime;
	}
}
