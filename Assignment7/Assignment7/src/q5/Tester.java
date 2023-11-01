package q5;

public class Tester {
	public static void main(String[] args) {
		
		String[] str = {"Hello","Dare","Water","Air","Chetan","Rahuo"};
//		char[] vowels = {'a','e','i','o','u'};
		
		for(String s: str) {
			
//			if(s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)=='u') {
//				System.out.println(s);
//			}
			if(s.endsWith("o") || s.endsWith("a")) {
				System.out.println(s);
			}
		}
	}
}
