/**
 * 
 */
package jyosh.leetcode.solutions.java;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Subash
 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 *
 */
public class PlusOne {
	
	public int[] plusOne(int[] digits){
		
		ArrayList<Integer> digitsList = new ArrayList<Integer>(digits.length);
		int carry = 1;
		for(int i=digits.length-1; i>=0; i--){
			int number = digits[i];
			number = number + carry;			
			carry = number/10;
			digitsList.add(0, number%10);
		}
		if(carry >0){
			digitsList.add(0,carry);			
		}		
		return toIntArray(digitsList);
	}

	int[] toIntArray(List<Integer> list){
		  int[] ret = new int[list.size()];
		  for(int i = 0;i < ret.length;i++)
		    ret[i] = list.get(i);
		  return ret;
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int digits[]={8,9,9,9,9,9,9};
		int[] result =  new PlusOne().plusOne(digits);
		printArray(result,result.length);

	}

	private static void printArray(int[] array, int loopCount) {

		for(int i=0; i<loopCount ; i++){
			System.out.print(" " + array[i]);			
		}
		System.out.println(" ");
	}
}
