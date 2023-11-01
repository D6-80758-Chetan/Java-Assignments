package q2;

public class Tester {
	public static void main(String[] args) {
		StringBuffer ans = new StringBuffer();
		String a = "My Name is Chetan Kushwaha";
		
		String[] b = a.split(" ");
		for(String s: b) {
			ans.append(s.charAt(0));
		}
		System.out.println(ans);
	}
}
