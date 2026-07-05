package String;

public class Panagram {
public static void main(String[] args) {
	String str = "abcdefghijklmnopqrstuvwxyz";
	str = str.toLowerCase();
	
	boolean[] alphabet = new boolean[26];
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		
		if(ch>='a' && ch<='z') {
			alphabet[ch - 'a'] = true;
		}
	}
	
	boolean isPanagram = true;
	
	for(int i=0;i<26;i++) {
		if(!alphabet[i]) {
			isPanagram = false;
			break;
		}
	}
	
	if(isPanagram) {
		System.out.println("Panagram");
	}
	else {
		System.out.println("Not Panagram");
	}
}
}
