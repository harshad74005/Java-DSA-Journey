package strings;

public class Palindrone {

	public static void main(String[] args) {
		String s = "mada";
		StringBuilder str = new StringBuilder(s);
		String rev = str.reverse().toString();
		if(s.equals(rev))
		{
			System.out.println("is palindron");
		}
		
		else {
			System.out.println("not");
		}
	}
}
