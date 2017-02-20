package Paypal;

/*
 * Shift the Letters of a Word

	Write a function to shift the letters of a word left (passing in a negative shift) or right( (passing in a positive shift).  
	Any letters that overflow left would be appended to the end of the word, any letters that overflow right would be placed in the beginning of the word

	Example: shift("alpha", -2) -2 <=> -7 <=> -12
	Output: phaal

	Example: shift("alpha", +2)
	Output: haalp
 */
public class Shift {

	public static void main(String[] args) {
		System.out.println(shift("alpha", 2));
	}

	public static String shift(String str, int n) {
		if (str == null || str.isEmpty() || n == 0) {
			return str;
		}
		StringBuilder sb = new StringBuilder();
		int len = str.length();

		if (n > 0) {
			while (n > len) {
				n -= len;
			}
			int M = n;
			
			String secondPart1 = str.substring(0, len - M); //
			String firstPart1 = str.substring(len - M, len);
			sb.append(firstPart1);
			sb.append(secondPart1);
		} else if (n < 0) {
			n = -n;
			while (n > len) {
				n -= len;
			}
			int N = n;

			String secondPart2 = str.substring(0, Math.abs(N)); //
			String firstPart2 = str.substring(Math.abs(N), len); //
			sb.append(firstPart2);
			sb.append(secondPart2);
		}
		return sb.toString();
	}

}
