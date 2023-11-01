package q1;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		
		StringBuilder str  = new StringBuilder();
//		System.out.println(str);
//		str.append("malayalam");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		str.append(temp);
//		str.append(false);
//		
//		
////		for(int i = 0; i < str.length(); i ++) {
////			str.charAt(i) = 10;
////		}
////		str[10] = 10;
//		
		StringBuilder rev = new StringBuilder();
		rev.append(str);
		rev.reverse();
		
		
		
		System.out.println(str);
//		System.out.println(s1.hashCode());
//		System.out.println(str.hashCode());
//		System.out.println(str);
//		System.out.println(s1);ln(str);
//		System.out.println(s1.hashCode());
//		System.out.println(str.hashCode());
//		System.out.println(str);
//		System.out.println(s1);
//		System.out.println(str.equals(s1));
		int i = 0;
		boolean flag = true;
		while (i< rev.length()) {
			System.out.println(rev.charAt(i)+" "+str.charAt(i));
			if(rev.charAt(i)!=str.charAt(i)) {
				flag = false;
				break;
			}
			i++;
			
		}
		if(flag) {
			System.out.println("Its a Palindrom!!");
		}
		else {
			
			System.out.println("Not a Palindrom!!");
		}
		
//		StringBuffer s1 = new StringBuffer("Sunbeam");
//		StringBuffer s2 = new StringBuffer("Sunbeam");
//		System.out.println(s1 == s2);
//		// ???
//		System.out.println(s1.equals(s2)); 
		
	}
}
