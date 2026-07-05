package String;

public class LargestWordFromString {

	public static void main(String[] args) {
		
		String str = "I am learning java";
		
		String[] split = str.split(" ");
		String result = "";
		
		
		for(int i=0; i<split.length; i++) {
			if(split[i].length() > result.length())
				result = split[i];
			
		}
		System.out.println(result);
	}

}
