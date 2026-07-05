package LogicalPractice;

public class ProductOfDigits {
public static void main(String[] args) {
	int num = 345;
	int product = 1;
	
	while(num!=0) {
		int digit = num%10;
		product*=digit;
		num = num/10;
	}
	System.out.println("Product of digits is: "+product);
}
}
