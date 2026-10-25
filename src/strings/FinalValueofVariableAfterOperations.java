package strings;

public class FinalValueofVariableAfterOperations {
static int finalvalue(String[] operations)
{
	int x =0;
	for(String op:operations)
	{
		if(op.charAt(1)=='+')
		{
			x++;
		}
		else
		{
			x--;
		}
	}
	return x;
}
public static void main(String[] args) {
	String[] operations = {"--X","X++","X++"};
	int res = finalvalue(operations);
	System.out.println(res);
}
}

// leetcode quetion no 2011
