package com.two.IntegerMath_aToz;

public class RevereseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(123));
	}

	public static int reverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int temp = num % 10;
			rev = (rev * 10) + temp;
			num = num / 10;
		}
		return rev;
	}

}
