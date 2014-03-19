// Fisher Adelakin
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

public class Problem3 {
	
	public static boolean isPrime(int n) {
        if (n == 2) 
        	return true;
        if (n % 2 == 0 || n == 1) 
        	return false;
        long limit = (long)Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2)
            if (n % i == 0) 
            	return false;
        return true;
	}
 
	public static void main(String args[]) {
        long n = Long.parseLong("600851475143");
        int max = 0;
        while (n != 1) {
            int i = 2;
            while (i <= n) {
                if (isPrime(i) && n % i == 0) {
                    if (i > max) max = i;
                    n /= i;
                    break;
                }
                ++i;
            }
        }
        System.out.println(max);
}
}
