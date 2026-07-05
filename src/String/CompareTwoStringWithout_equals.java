package String;

public class CompareTwoStringWithout_equals {
public static void main(String[] args) {
	String s1 = "hello";
	String s2 = "hello";
	
	boolean isequal = true;
	
	if(s1.length() != s2.length()) {
		isequal = false;
	}
	else {
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				isequal = false;
			}
		}
	}
	if(isequal)
		System.out.println("True");
	else
		System.out.println("False");
}
}