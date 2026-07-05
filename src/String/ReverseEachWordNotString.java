package String;

public class ReverseEachWordNotString {
public static void main(String[] args) {
	String str = "Narayan Bachewar";
	String word = "";
	String result = "";
	
	str = str.toLowerCase();
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		
		if(ch!=' ') {
			word = ch+word;
		}
		else {
			result+=word+" ";
			word = "";
		}
	}
	result = result+word;
	
	System.out.println(result);
}
}
