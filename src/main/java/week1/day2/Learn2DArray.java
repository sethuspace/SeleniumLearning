package week1.day2;

public class Learn2DArray {

	public static void main(String[] args) {
		int[][] a = new int[3][3];

		a[0][0] = 3;
		a[0][1] = 4;
		a[0][2] = 5;

		a[1][0] = 1;
		a[1][1] = 2;
		a[1][2] = 3;

		a[2][0] = 7;
		a[2][1] = 9;
		a[2][2] = 8;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
