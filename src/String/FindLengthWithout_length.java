package String;

public class FindLengthWithout_length {
public static void main(String[] args) {
	String str = "narayan";
	int count = 0;
	
	try {
		while(true) {
			str.charAt(count);
			count++;
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println(count);
}
}
