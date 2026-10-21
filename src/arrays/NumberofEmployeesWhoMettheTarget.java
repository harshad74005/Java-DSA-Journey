package arrays;

public class NumberofEmployeesWhoMettheTarget {
static int numberofemployee(int[] hours,int target)
{
	int count=0;
	for(int i=0;i<hours.length;i++)
	{
		
		if(target<=hours[i])
		{
			count++;
		}
	}
	return count;
}
public static void main(String[] args) {
	int[] hours= {0,1,2,3,4};
	int target = 6;
	int res = numberofemployee(hours, target);
	System.out.println(res);
}
}
