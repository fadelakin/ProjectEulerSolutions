// Fisher Adelakin
// 2520 is the smallest number that can be divided by each of 
// the numbers from 1 to 10 without any remainder.

// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Problem5 {
	
	 private static boolean canBeDivided(long num , int untilNum)
	 {
	     boolean can = true;
	     for (int i=1;i<untilNum && can;i++)
	     {
	         if (num % i != 0)
	         {
	             can = false;
	         }
	     }
	     return can;
	 }
	 
	 public static void main(String[] args) {
		 int until = 20;
	     int i = 20;
	     boolean found = false;
	     // search for a number that divides by all of the numbers until 20 ,
	     // of course the minimum number will be 20
	     while (!found)
	     {
	         found = canBeDivided(i++, until);
	         if (found)
	         {
	             // we've increased i already
	             System.out.println(i - 1);
	         }
	     }
	 }
}
