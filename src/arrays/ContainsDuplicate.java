package arrays;

import java.util.HashSet;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(!s.add(nums[i]))
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		boolean result = containsDuplicate(nums);
		System.out.println("Result : "+result);
	}
}
//leetcode problem : 217