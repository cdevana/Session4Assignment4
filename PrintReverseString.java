package session4;

public class PrintReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = new String("String1");
		
		int length = str.length();
		char[] charArray = str.toCharArray();
		
		for(int i = length-1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		
		/* Input: String1
		 * Output: 1gnirtS
		 */
	}

}
