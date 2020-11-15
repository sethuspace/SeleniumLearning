package week1.day2;

public class Addition {
	
	int s = 0;
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		int sum = a.add(3, 4);
		System.out.println(sum);
	}

}
