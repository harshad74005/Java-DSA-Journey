package arrays;

public class PrintPrimeNumberafter100 {
public static void main(String[] args) {
	int num = 101;
	int count =0;
	
	while(count < 5)
	{
		int c =0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println(num);
			count++;
		}
		num++;
	}
}
}
