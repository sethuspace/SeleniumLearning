package assignments;

public class PrimeNumbers {
	
//	Psuedocode
//	1. Iterate a for loop from 1 to 100
//	2. Define a boolean isPrime
//	3. Iterate a inner for loop from 2 until the value is less than outer loop value
//	4. check  if quotient of i and j is zero
//	5. if yes then make the boolean false
//	6. close the inner for loop
//	7. check if isPrime is true then print the number in outer for loop and close it.
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			boolean isPrime = true;
			for (int j =2 ; j < i; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("Prime Number: "+i);
			}
		}
	}

}
