package com.assignment.one;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q2PrintTheNumberInTheIndex {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		printTheIndexNumber(2, arr);
		printTheIndexNumberJava8(2, arr);
	}

	/*
	 * Example 1: Input: 5, 2,- 10 20 30 40 50 Output: 30 Example 2: Input: 7 4 10
	 * 20 30 40 50 60 70 Output: 50
	 */

	public static void printTheIndexNumber(int index, int[] arr) {
		System.out.println(arr[index]);
	}

	public static void printTheIndexNumberJava8(int index, int[] arr) {
		IntStream.range(0, arr.length).filter(num -> num == index).findFirst()
				.ifPresent(num -> System.out.println(arr[num]));
		Arrays.stream(arr).limit(index).findFirst();
	}
}
