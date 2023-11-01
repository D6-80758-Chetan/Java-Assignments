package q3;

public class Tester {
	public static void main(String[] args) {
		String a = "this is string";
		String[] b = a.split(" ");
		StringBuilder ans = new StringBuilder();
		
		for(String s: b) {
			StringBuilder str = new StringBuilder(s);
			str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
			ans.append(str).append(" ");
			System.out.println(str);
		}
		System.out.println(ans);
	}
}
