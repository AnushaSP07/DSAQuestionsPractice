package com.assignment.one;

import java.util.Arrays;

public class Q1SumOfInteger {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 3, 10, 22, 45 };
		getSumOfInteger(6, arr);
		getSumOfIntegerJava8(6, arr);
	}

	/*
	 * Example 1: Input: 4 - 1 2 3 4 Output: 10 Example 2: Input: 6 - 5 8 3 10 22 45
	 * Output: 93
	 */
	public static void getSumOfInteger(int n, int[] arr) {
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += arr[i];
		}
		System.out.println("total " + total);
	}

	public static void getSumOfIntegerJava8(int n, int[] arr) {
		int total = Arrays.stream(arr).limit(n).sum();
		System.out.println("total " + total);
	}
}
