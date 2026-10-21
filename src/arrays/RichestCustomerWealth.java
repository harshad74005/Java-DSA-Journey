package arrays;

public class RichestCustomerWealth {
static int maxcount(int[][] accounts)
{
	int maxwelth=0;
	for(int i=0;i<accounts.length;i++)
	{
		int currentwelth=0;
		for(int j=0;j<accounts[i].length;j++)
		{
			currentwelth+=accounts[i][j];
		}
		if(currentwelth>maxwelth)
		{
			maxwelth=currentwelth;
		}
	}
	return maxwelth;
}
public static void main(String[] args) {
	int[][] accounts = {{1,2,3},{3,2,1}};
	int res = maxcount(accounts);
	System.out.println(res);
}
}


// leetcode quetins no 1672