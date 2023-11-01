package q4;

public class Tester {
	public static void main(String[] args) {
		String s = "Example";
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(i%2!=0) {
				
				ans.append(Character.toUpperCase(s.charAt(i)));
			}
			else {
				
				ans.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println(ans);
	}
}
