package collections;

import java.util.Arrays;
import java.util.List;

public class CheckOddList {
public static boolean isOddList(List<Integer>list)
{
	if(list==null || list.isEmpty())
	{
		return false;
	}
	for(int num:list)
	{
		if(num%2==0)
		{
			return false;
		}
		
	}
	return true;
}
public static void main(String[] args) {
	List<Integer> a1 = Arrays.asList(1,3,5,7,9);
	List<Integer> a2 = Arrays.asList(2,5,8);
	System.out.println("List 1 is : "+isOddList(a1));
	System.out.println("List 2 is : "+isOddList(a2));
}
}
