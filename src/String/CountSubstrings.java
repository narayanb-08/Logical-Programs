package String;

public class CountSubstrings {
public static void main(String[] args) {
	String str = "narayan";
	
	int n = str.length();
	
	int count = n*(n+1)/2;
	System.out.println("Number of substrings: "+count);
}
}
