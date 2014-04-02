import java.math.BigInteger;

public class problem15 {

	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(40);
		BigInteger r = BigInteger.valueOf(20);
		
		System.out.println(factorial(n).divide(((BigInteger) factorial(r)).multiply(factorial(n.subtract(r)))));
	}

	private static BigInteger factorial(BigInteger n) {
		if(n.compareTo(BigInteger.ZERO) <= 0) {
			return BigInteger.ONE;
		} else {
			return (n.multiply(factorial(n.subtract(BigInteger.ONE))));
		}
	}
}
