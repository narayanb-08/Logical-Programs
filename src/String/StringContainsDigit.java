package String;

public class StringContainsDigit {
public static void main(String[] args) {
	String str = "08";
	
	boolean isDigit = true;
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		
		if(ch<'0' || ch>'9') {
			isDigit = false;
			break;
		}
	}
	
	if(isDigit) {
		System.out.println("Digits only");
	}
	else {
		System.out.println("Not only digits");
	}
}
}
