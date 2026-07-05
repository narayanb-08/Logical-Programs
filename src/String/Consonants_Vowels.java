package String;

public class Consonants_Vowels {
public static void main(String[] args) {
	String str = "welcome to my world";
	int vowels = 0;
	int consonants = 0;
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch != ' ') {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			vowels++;
		}
		else {
			consonants++;
		}
	}
	}
	System.out.println("Vowels: "+vowels);
	System.out.println("Consonats: "+consonants);
}
}
