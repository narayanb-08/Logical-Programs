package LogicalPractice;

public class PrintDigits {
public static void main(String[] args) {
	int num = 12345;
	
	while(num != 0) {
		int digit = num%10;
		System.out.println(digit);
		num = num/10;
	}
}
}
