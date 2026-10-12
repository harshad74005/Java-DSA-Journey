package strings;

public class StringCounting {
	public static void main(String[] args) {
		String str = "My name is Harshad Chavare";
		int[] count = new int[26];
		for(char ch:str.toLowerCase().toCharArray())
		{
			if(ch>='a' && ch<='z' && "aeiou".indexOf(ch)==-1)
			{
				count[ch-'a']++;
			}
		}
		for(char ch='a';ch<='z';ch++)
		{
			if(count[ch-'a']>0)
			{
				System.out.println(ch+":"+count[ch-'a']);
			}
		}
	}

}
