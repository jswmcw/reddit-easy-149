/**
 * @author JeremyW
 * https://www.reddit.com/r/dailyprogrammer/comments/1ystvb/022414_challenge_149_easy_disemvoweler/
 * 
 */
package easy149;

public class Easy149 {
	private static StringBuilder phrase = new StringBuilder("");
	private static String vowels = "";

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: disemvowel [Phrase]");
			System.exit(0);
		}
		for (int i = 0; i < args.length; i++) {
			phrase.append(args[i]);
		}
		for (int i = 0; i < phrase.length(); i++) {
			String letter = String.valueOf(phrase.charAt(i));
			if (letter.matches("[aeiouAEIOU]")) {
				vowels += letter;
				phrase.setCharAt(i, ' ');
			}
			
		}
		System.out.println(phrase.toString().replaceAll(" ", ""));
		System.out.println(vowels);

	}

}
