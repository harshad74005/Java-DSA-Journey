package arrays;

public class RepeativeIntegerCount {

	public static void main(String[] args) {
		int[] arr= {5,4,8,1,26,8,2};
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
		System.out.println(maxcount);
		System.out.println(mostfrequentcount);
	}
}
