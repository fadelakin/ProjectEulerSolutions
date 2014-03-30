public class problem12 {
	
	private static int numberT;
	private static int divCount;
	
	public static int check(int x) {
		divCount = 0;
		for(int i = 1; i <= Math.sqrt((double) x); i++) {
			if (x % i == 0)
				divCount++;
		}
		return 2 * divCount;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i < 30000; i++) {
			numberT = numberT + i;
			if(check(numberT)>500) {
				System.out.println(numberT);
				break;
			}
		}
	}

}
