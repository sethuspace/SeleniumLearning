package week1.day2;

public class LearnStrings {

	public static void main(String[] args) {
		/*
		 * int a = 5; int b = 5; if(a==b) { System.out.println("a and b are equal"); }
		 */
		
		String s1 = "hellos";
		String s2 = "Hello";
		
		/*
		 * if(s1.equals(s2)) { System.out.println("S1 and S2 are equal"); }else {
		 * System.out.println("S1 and S2 are not equal"); }
		 * 
		 * if(s1.equalsIgnoreCase(s2)) {
		 * System.out.println("S1 and S2 are equal using ignore case"); }
		 */
		
		
		int size = s1.length();
		System.out.println("Size of the string is "+size);
		
		for (int i = 0; i < size; i++) {
			char c = s1.charAt(i);
			System.out.println(c+ " : "+ s1.indexOf(c));
		}
		
		System.out.println("SubString: "+s1.substring(size-1));

	}

}
