package assignments;

import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] input = {4, 3, 5, 2, 1, 8, 9, 7, 0, 6};
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			max = Math.max(input[i], max);
		}
		System.out.println("Solution1: " + max);
		System.out.println("Solution2: " + solution2(input));
		
	}
	
	public static int solution2(int[] input) {
		Arrays.sort(input);
		return input[input.length-1];
	}
	
	public void getlargeNumber(){
		int[] input = {4, 3, 5, 2, 1, 8, 9, 7, 0, 6};
		int max= 0;
		for(int i=0; i<input.length; i++){
			if(input[i]>max){
				max= input[i];	
			}
		} 
		System.out.println(max);
	}

}
