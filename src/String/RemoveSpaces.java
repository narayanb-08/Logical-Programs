package String;

public class RemoveSpaces {
public static void main(String[] args) {
	String str = "I Love You";
	String newStr = "";
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch!=' ') {
			newStr += ch;
		}
	}
	System.out.println(newStr);
}
}
