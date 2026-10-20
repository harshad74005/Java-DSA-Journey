package arrays;

import java.util.Arrays;

public class ShuffletheArray {
static int[] shuffle(int[] nums,int n)
{
	int index=0;
	int[] result = new int[n*2];
	for(int i=0;i<n;i++)
	{
		result[index]=nums[i];
		index++;
		result[index]=nums[i+n];
		index++;
	}
	return result;
}
public static void main(String[] args) {
	int[] nums = {2,5,1,3,4,7};
	int n=3;
	int[] res = shuffle(nums,n);
	System.out.println(Arrays.toString(res));
}
}
// leetcode problem no  1470
