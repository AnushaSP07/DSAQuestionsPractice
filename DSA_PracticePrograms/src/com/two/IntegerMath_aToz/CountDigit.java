package com.two.IntegerMath_aToz;

/*Example 1:
Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.
Example 2:
Input:N = 7789
Output: 4
Explanation: The number 7789 has 4 digits.*/

public class CountDigit {

	public static void main(String[] args) {
		countDigit(7789);
	}

	/* Brute Force Approach */
	public static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count = count + 1;
			num = num / 10;
		}
		System.out.println("Count of Number = " + count);
		return count;
	}
	
	/* Space and Time Complexity */
	
	/*
	 * Space Complexity = O(1)- as it will take consant amount of memory regardless
	 * of input size 
	 * 
	 * Time Complexity = O(log10 N+1) - The time complexity is
	 * determined by the number of digits in the input integer N. In the worst case
	 * when N is a multiple of 10 the number of digits in N is log10N + 1.
	 * 
	 * In the while loop we divide N by 10 until it becomes 0 which takes log10N
	 * iterations. In each iteration of the while loop we perform constant time
	 * operations like division and increment the counter.
	 */
	
	public static int optimalApproachToCountDigit(int num) {
		return (int) (Math.log10(num) + 1);
		
		/*
		 * Time Complexity: O(1)as simple arithmetic operations in constant time are
		 * computed on integers.
		 * 
		 * Space Complexity : O(1)as only a constant amount of additional memory for the
		 * count variable regardless of size of the input number.
		 */
	}
}
