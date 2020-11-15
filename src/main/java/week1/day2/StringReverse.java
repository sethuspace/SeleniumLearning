package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		String s1 = "hello";
		String output = "";
		int size = s1.length();
		for (int i = size-1; i >=0; i--) {
			output = output+s1.charAt(i);
		}
		System.out.println(output);
	}

}
