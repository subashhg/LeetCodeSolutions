/**
 * 
 */
package jyosh.leetcode.solutions.java;

/**
 * @author Subash
 *
 */
public class RomanToInteger {

	public int romanToInt(String s) {
		int num = 0;
		if (s == null || s.length() == 0) {

			return num;

		}
		int prevVal = 0;
		int curVal = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char curChar = s.charAt(i);
			curVal = getCurrtentVal(curChar);
			if (curVal >= prevVal) {
				num = num + curVal;
			} else {
				num = num - curVal;
			}
			prevVal = curVal;
		}

		return num;
	}

	private int getCurrtentVal(char curChar) {
		int curVal = 0;
		switch (curChar) {
		case 'i':
		case 'I':
			curVal = 1;
			break;

		case 'v':
		case 'V':
			curVal = 5;
			break;

		case 'x':
		case 'X':
			curVal = 10;
			break;

		case 'l':
		case 'L':
			curVal = 50;
			break;

		case 'c':
		case 'C':
			curVal = 100;
			break;

		case 'd':
		case 'D':
			curVal = 500;
			break;

		case 'm':
		case 'M':
			curVal = 1000;
			break;
		}
		return curVal;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "XCIX";
		System.out.println(new RomanToInteger().romanToInt(s));
	}

}
