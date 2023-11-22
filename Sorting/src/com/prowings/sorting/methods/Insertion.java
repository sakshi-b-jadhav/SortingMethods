package com.prowings.sorting.methods;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 5, 2, 6 };
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
}

	public static void insertionSort(int[] nums) {
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			int key = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j = j - 1;
			}
			nums[j + 1] = key;
		}
	}
}
