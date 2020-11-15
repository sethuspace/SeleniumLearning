package week1.day2;

public class LearnArrayReverse {

	public static void main(String[] args) {
		char[] c = {'a', 'e', 'i', 'o', 'u'};
		int size = c.length;  // ctrl+2 then L
		
		for (int i = size-1; i >=0; i--) {
			System.out.println(c[i]);
		}
		

	}

}
