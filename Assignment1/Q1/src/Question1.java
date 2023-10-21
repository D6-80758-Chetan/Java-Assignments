import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Integer value = new Integer(0);
		
		System.out.println("Enter the No:");
		value = sc.nextInt();
		
		System.out.println("Given No. is"+ value);
		System.out.println("Binary Equivalent: " + Integer.toBinaryString(value));
		System.out.println("Hexa Decimal" + Integer.toHexString(value));
		System.out.println("Octal Equivalent: "+Integer.toOctalString(value));
		
	}
}
