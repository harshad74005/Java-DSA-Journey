package arrays;

import java.util.Arrays;

public class ConcatenationofArray {
static int[] getConcatinationArray(int[] nums)
{
	int n=nums.length;
	int res[] = new int[n*2];
	for(int i = 0 ;i<n;i++)
	{
		res[i]=nums[i];
		res[n+i]=nums[i];
	}
	return res;
}
public static void main(String[] args) {
	int[] nums = {1,2,1};
	int result[] = getConcatinationArray(nums);
	System.out.println(Arrays.toString(result));
}
}

// leetcode qution no 1929