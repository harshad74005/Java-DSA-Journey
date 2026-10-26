package strings;

public class LengthofLastWord {
static int lastIndexLength(String s)
{
	s = s.trim();
	int len = 0;
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)==' ')
		{
			break;
		}
		len++;
	}
	return len;
}
public static void main(String[] args) {
	String s ="   fly me   to   the moon  ";
	int res = lastIndexLength(s);
	System.out.println(res);
}
}

// leetcode quetion no 58