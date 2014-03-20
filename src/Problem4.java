public class Problem4 {
	
	public static int reverse(int num) {
        int i = 0;
        while (num != 0) {
            int r = num % 10;
            i = (i * 10) + r;
            num /= 10;
        }
        return i;
	}
 
	public static boolean isPalindrome(int n) {
        return (n == reverse(n)) ? true : false;
	}
 
	public static void main(String args[]) {
        int max = 0;
        for (int i = 100; i <= 999; ++i)
            for (int j = i; j <= 999; ++j) {
                int p = i * j;
                if (isPalindrome(p) && p > max) max = p;
            }
        System.out.println(max);
	}
}