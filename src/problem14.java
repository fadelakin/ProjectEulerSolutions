import java.util.ArrayList;


public class problem14 {
	
	public static void main(String[] args) {
		
		ArrayList<Long> list = new ArrayList<Long>();
		
		long length = 0;
		int res = 0;
		
		for(int j = 10; j < 1000000; j++) {
			long i = j;
			
			while (i != 1) {
				if(i % 2 == 0) {
					i /= 2;
					list.add(i);
				} else {
					i = (3 * i) + 1;
					list.add(i);
				}
			}
			
			if(list.size() > length) {
				length = list.size();
				res = j;
			}
			list.clear();
		}
		
		System.out.println(res + " with chain size: " + length);
	}

}
