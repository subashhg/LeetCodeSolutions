/**
 * 
 */
package jyosh.leetcode.solutions.java;

import java.util.Arrays;

/**
 * @author Subash
 *
 */
public class SingleNumber {

	public int singleNumber(int[] nums) {
		int singleNumber = 0;

		Arrays.sort(nums);
		if (nums.length == 1)
			singleNumber = nums[0];
		else if (nums[0] != nums[1])
			singleNumber = nums[0];
		else if (nums[nums.length - 1] != nums[nums.length - 2])
			singleNumber = nums[nums.length - 1];
		else {
			for (int i = 1; i < nums.length - 1; i++) {
				if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
					singleNumber = nums[i];
					break;
				}
			}
		}

		return singleNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
