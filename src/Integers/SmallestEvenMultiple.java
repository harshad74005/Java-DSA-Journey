package Integers;

public class SmallestEvenMultiple {
static int smallEvenMultiplication(int n)
{
	return (n%2==0) ? n:n*2;
}
public static void main(String[] args) {
	int n = 6;
	int res = smallEvenMultiplication(n);
	System.out.println(res);
}
}
