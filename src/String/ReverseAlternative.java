package String;

public class ReverseAlternative {
public static void main(String[] args) {
	String str = "welcome to my world";
	String word = "";
	String result = "";
	
	for(int i=str.length()-1;i>=0;i--) {
		char ch = str.charAt(i);
		
		if(ch != ' ') {
			word = ch+word;
		}
		else {
			result += word+" ";
			word = "";
		}
	}
	result+=word;
	System.out.println(result);
	
}
}
