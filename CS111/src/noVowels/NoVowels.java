package noVowels;

public class NoVowels {

	public static void main(String[] args) {
		String str1 = "cool";
		String str2 = noVowels(str1);
		System.out.println(str2);
	}
	public static String noVowels(String str) {
		String str2 = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(!isVowel(str.charAt(i))) {
				str2 += str.charAt(i);
			}
		}
		return str2;
	}
	public static boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		else {
			return false;
		}
	}
}