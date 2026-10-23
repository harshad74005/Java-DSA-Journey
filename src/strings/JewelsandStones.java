package strings;

public class JewelsandStones {
static int numJewelsInStones(String jewels,String stones)
{
	int count=0;
	for(int i=0;i<stones.length();i++)
	{
		for(int j=0;j<jewels.length();j++)
		{
			if(stones.charAt(i)==jewels.charAt(j))
			{
				count++;
			}
		}
	}
	return count;
}
public static void main(String[] args) {
	String stones = "aAAbbbbb";
	String jewels = "aA";
	int res = numJewelsInStones(stones,jewels);
	System.out.println(res);
}
}

// leetcode quetion no 771