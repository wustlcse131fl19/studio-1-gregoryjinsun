package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Please enter your name.");
		String s1 = ap.nextString("Please enter you're best friend's name.");
		String s2 = ap.nextString("Please enter your mother's name.");
		String s3 = ap.nextString("Please enter your pet's name.");
		System.out.println("Greetings "+s0+", "+s1+", "+s2+", "+s3+".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
