package week1.day2;

public class LargestNumber {
	
	public int getLargest(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public void getLargest() {
		int a = 5;
		int b =3;
		if(a>b) {
			System.out.println("a is bigger");
		}else {
			System.out.println("b is greater");
		}
	}

	public static void main(String[] args) {
		LargestNumber l1 = new LargestNumber();
		int largest = l1.getLargest(5, 6);
		System.out.println("l1: "+largest);
		
		LargestNumber l2 = new LargestNumber();
		int l2Large = l2.getLargest(6, 4);
		System.out.println("l2: "+l2Large);
		
		l2.getLargest();

	}

}
