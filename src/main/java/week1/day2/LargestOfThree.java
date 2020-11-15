package week1.day2;

public class LargestOfThree {

	
	//Example of Nested -if
	public void getlargestOfthree(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			System.out.println("A is Bigger");
		} else if (b > c) {
			System.out.println("B is Bigger");
		} else {
			System.out.println("C is Bigger");
		}
	}

	public static void main(String[] args) {
		LargestOfThree l1 = new LargestOfThree();
		l1.getlargestOfthree(8, 5, 6);
		l1.getlargestOfthree(5, 8, 6);
		l1.getlargestOfthree(6, 5, 8);

	}

}
