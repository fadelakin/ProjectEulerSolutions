import java.math.BigInteger;


public class problem16 {
	
	public static void main(String[] args) {
		
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		System.out.println(calcDigs(n.toString()));
		
	}
	
	public static int calcDigs(String s) {
		
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			Character c = new Character(s.charAt(i));
			String y = c.toString();
			int j = Integer.parseInt(y);
			sum += j;
			
		}
		
		return sum;
	}

}
