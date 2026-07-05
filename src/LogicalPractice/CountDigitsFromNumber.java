package LogicalPractice;

public class CountDigitsFromNumber {
public static void main(String[] args) {
	int num = 12345;
	int count = 0;
 	
	while(num!=0) {
		int digit = num%10;
		count++;
		num = num/10;
	}
	System.out.println("Digits in a number is: "+count);
}
}
