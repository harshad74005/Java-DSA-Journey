package arrays;

import java.util.Arrays;

public class ReverseArray {
public static int[] reverseArray(int[] arr)
{

	int left=0;
	int right = arr.length-1;
	while(left<right)
	{
		int temp = arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
		left++;
		right--;
	}
	return arr;
}
public static void main(String[] args) {
	int[] arr = {10,20,30,40};
	int[] result = reverseArray(arr);
	System.out.println("Reverse : "+Arrays.toString(result));
}
}
