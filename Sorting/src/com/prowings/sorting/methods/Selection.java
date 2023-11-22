package com.prowings.sorting.methods;

import java.util.Arrays;

public class Selection {
	
	public static void main(String[] args) {
		
		int[] nums= {3,4,6,2,1,9,5};
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void selectionSort(int[] nums) 
	{
		int n=nums.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(nums[j]<nums[min])
				{
					min=j;
					
				}
			}
			int temp=nums[min];
			nums[min]=nums[i];
			nums[i]=temp;
		}
		
	}

}
