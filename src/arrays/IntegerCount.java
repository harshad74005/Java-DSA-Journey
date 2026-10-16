package arrays;

public class IntegerCount {
public static void main(String[] args) {
	
	int[] arr = {1,2,3,4,5,1,2,5,6};
	int maxcount=0;
	int mostfrequentcount=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		int currentcount=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				currentcount++;
			}
		}
		if(currentcount > maxcount)
		{
			maxcount=currentcount;
			mostfrequentcount=arr[i];
		}
	}
	System.out.println("Most frequent : "+mostfrequentcount);
	System.out.println("mostcount : "+maxcount);
}
}
