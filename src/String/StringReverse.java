package String;

public class StringReverse {
public static void main(String[] args) {
	String str = "Welcome To New World";//World New To Welcome

	String word = "";
	String result ="";
	
	
	//str = str.toLowerCase();
	
	for(int i=str.length()-1;i>=0;i--) {
		char ch = str.charAt(i);
		
		if(ch != ' ') {
			word = ch+word;
		}
		else {
			result+=word+" ";
			word="";
		}
	}
	result+=word;
	System.out.println(result);
//	String[] split = str.split(" ");
//	for(int i=split.length-1;i>=0;i--)
//	{
//		System.out.println(split[i]);
//	}
	
}
}
