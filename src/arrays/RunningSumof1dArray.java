package arrays;

import java.util.Arrays;

public class RunningSumof1dArray {

	static int[] runningSum(int[] nums)
	{
		for(int i=1;i<nums.length;i++)
		{
			nums[i]=nums[i]+nums[i-1];
		}
		return nums;
	}


public static void main(String[] args) {
	int[] nums = {1,2,3,4};
	int[] res = runningSum(nums);
	System.out.println(Arrays.toString(res));
}
}
// leetcode problem no 1480