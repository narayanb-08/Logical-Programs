package String;

public class CountCharacters {
public static void main(String[] args) {
	String str = "Narayan_08";
	int alphabet = 0;
	int digit = 0;
	int spc = 0;
	str = str.toLowerCase();
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		
		if(ch>='a' && ch<='z') {
			alphabet++;
		}
		else if(ch>='0' && ch<='9') {
			digit++;
		}
		else {
			spc++;
		}
	}
	System.out.println("Alphabets: "+alphabet+"\nDigits: "+digit+"\nSpecial Character: "+spc);
}
}
