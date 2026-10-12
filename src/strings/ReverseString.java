package strings;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Harshad";
		StringBuilder str = new StringBuilder(s);
		String reverse = str.reverse().toString();
		System.out.println(reverse);
	}
}
