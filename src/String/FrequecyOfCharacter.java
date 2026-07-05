package String;

public class FrequecyOfCharacter {
public static void main(String[] args) {
	String str = "Narayan";
	char c = 'y';
	int freq = 0;
	
	str = str.toLowerCase();
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch==c) {
			freq++;
		}
	}
	System.out.println("Frequency of given char: "+freq);
}
}
