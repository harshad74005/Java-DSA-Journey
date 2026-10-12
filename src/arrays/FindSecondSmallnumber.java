package arrays;

public class FindSecondSmallnumber {

	public static void main(String[] args) {
		int[] a = {1,9,2,5};
		int firstsmall = Integer.MAX_VALUE;
		int secsmall = Integer.MAX_VALUE;
		for(int i = 0 ;i<a.length;i++)
		{
			if(a[i]<firstsmall)
			{
				secsmall=firstsmall;
				firstsmall=a[i];
			}
			else if(a[i]>firstsmall && a[i]<secsmall)
			{
				secsmall=a[i];
			}
		}
		System.out.println("Secsmall : "+secsmall);
	}
}
