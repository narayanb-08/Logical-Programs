package String;

public class SwapCharacterLowToHigh_HighToLow {
public static void main(String[] args) {
	String str = "NaRaYan_08";
	String result = "";
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		
		if(Character.isUpperCase(ch)) {
			result = result+ Character.toLowerCase(ch);
		}
		else if(Character.isLowerCase(ch)) {
			result = result + Character.toUpperCase(ch);
		}
		else {
			result = result + ch;
		}
	}
	System.out.println(result);
}
}
