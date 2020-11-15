package week1.day2;

public class LearnArrays {

	public static void main(String[] args) {
		int[] a = new int[6];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		
		//int[] b =  {1, 2, 3, 4, 5, 6};
		int size= a.length; //  it is a variable in Arrays class
		int output = 0;
		System.out.println("Size of an array: "+size);
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
			output = output +a[i];
			//1 = 0+1;
			//3=  1+2;
			//6 = 3+3;
			//10 = 6+4;
			//15 = 10+5;
			//21 = 15+6;
		}
		
		
		System.out.println(output);
	}

}
