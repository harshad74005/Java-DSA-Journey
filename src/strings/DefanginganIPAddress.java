package strings;

public class DefanginganIPAddress {
static String defangIpAddr(String address)
{
	String newText = address.replace(".", "[.]");
	return newText;
}
public static void main(String[] args) {
	String address = "1.1.1.1.1.";
	String res = defangIpAddr(address);
	System.out.println(res);
}
}

// leetcode quetion no 1108