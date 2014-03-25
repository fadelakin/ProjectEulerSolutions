// Fisher
// Project Euler Problem 9

public class Problem9 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double sum = 1000;
		boolean found = false;
		for (a = 1; a < sum / 3 && !found; a++) {
			for (b = a; b < sum / 2 && !found; b++) {
				c = sum - a - b;
				if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
					found = true;
					System.out.println("product of a, b, c = " + a * b * c);
					break;
				}
			}
		}
	}
}
