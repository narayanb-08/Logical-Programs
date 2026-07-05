package String;

public class Anagram {
public static void main(String[] args) {
	String s1 = "listen";
	String s2 = "silent";
	
	if(s1.length() != s2.length()) {
		System.out.println("Not Anagram");
		System.exit(0);
	}
	
	char[] a = s1.toCharArray();
	char[] b = s2.toCharArray();
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i] > a[j]) {
				char temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
			if(b[i] > b[j]) {
				char temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
		}
	}
	
	boolean isAnagram = false;
	for(int i=0;i<a.length;i++) {
		if(a[i] == b[i]) {
			isAnagram = true;
		}
		else {
			isAnagram = false;
		}
	}
	
	if(isAnagram) {
		System.out.println("Anagram");
	}
	else
		System.out.println("Not Anagram");
	
}
}
