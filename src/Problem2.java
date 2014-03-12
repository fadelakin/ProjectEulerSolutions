// Fisher Adelakin
// Solution to problem 2 on Project Euler

public class Problem2 {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z;
		int sum = 0;

		while (y <= 4000000) {
			z = x + y;
			x = y;
			y = z;
			if (y % 2 == 0) sum += y;
			System.out.println(sum);
		}
	}
}