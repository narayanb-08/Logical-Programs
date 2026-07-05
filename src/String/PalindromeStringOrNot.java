package String;

public class PalindromeStringOrNot {
public static void main(String[] args) {
	String str = "madam";
	String rev = "";
	
	for(int i=str.length()-1;i>=0;i--) {
		rev += str.charAt(i);
	}
	
	if(rev.equals(str)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
