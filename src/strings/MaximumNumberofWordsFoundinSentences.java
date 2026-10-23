package strings;

public class MaximumNumberofWordsFoundinSentences {
static int maxSentences(String[] sentences)
{
	int maxcount=0;
	for(int i=0;i<sentences.length;i++)
	{
		String currentSentences = sentences[i];
		int spaceCount=0;
		for(int j=0;j<currentSentences.length();j++)
		{
			if(currentSentences.charAt(j)==' ')
			{
				spaceCount++;
			}
		}
		int currentCount=spaceCount+1;
		if(currentCount>maxcount)
		{
			maxcount=currentCount;
		}
		
	}
	return maxcount;
}
public static void main(String[] args) {
	String[] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
	int res = maxSentences(sentences);
	System.out.println(res);
}
}


// leetcode quetion no  2214