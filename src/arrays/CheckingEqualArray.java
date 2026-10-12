package arrays;

import java.util.Arrays;

public class CheckingEqualArray {

	public static boolean havingsameElement(int[] a1,int[] a2)
	{
		if(a1.length != a2.length)
		{
			return false;
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}
	public static void main(String[] args) {
		int[] a1 = {1,5,2,4};
		int[] a2 = {1,2,5,4};
		System.out.println("tyen aray:"+havingsameElement(a1, a2));
	}
}
