package com.one.pattern_aToz;

public class PatternPrinting {

	public static void main(String[] args) {
		int n = 6;
		System.out.println("Pattern1");
		pattern1(n);
		System.out.println("Pattern2");
		pattern2(n);
		System.out.println("Pattern3");
		pattern3(n);
		System.out.println("Pattern4");
		pattern4(n);
		System.out.println("Pattern5");
		pattern5(n);
		System.out.println("Pattern6");
		pattern6(n);
		System.out.println("Pattern7");
		pattern7(n);
		System.out.println("Pattern8");
		//pattern8(n);
	}

	public static void pattern1(int n) {
		/*
		 * **** **** **** **** ****
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pattern2(int n) {
		/*
		 * * ** *** **** ***** ******
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pattern3(int n) {
		/*
		 * 1 12 123 1234 12345 123456
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public static void pattern4(int n) {
		/*
		 * 1 22 333 4444 55555 666666
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	public static void pattern5(int n) {
		/*
		 * ***** **** *** ** *
		 */
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pattern6(int n) {
		/*
		 * 12345 1234 123 12 1
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public static void pattern7(int n) {
		/*
		 * *
		  ***
		 *****
		*******
	   ********* 
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern8(int n) {
		/*
		 * 
	   ********* 
	    *******
	     *****
	      ***
	       *
		 */
		int count = 1;
		for (int i = n; i > 0; i--) {
			for(int j = 1; j <=i ; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= count; j++) {
				System.out.print(" ");
			}
			System.out.println();
			count++;
		}
	}
}
