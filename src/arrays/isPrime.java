package arrays;

public class isPrime {
public static void main(String[] args) {
	int n = 29;
	int count = 0;
	
	if(n<=1)
	{
		System.out.println("is not prime");
	}
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("Is prime");
	}
	else
	{
		System.out.println("is not prime");
	}
	}
	
}
