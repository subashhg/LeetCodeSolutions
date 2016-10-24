/**
 * 
 */
package jyosh.leetcode.solutions.java;

import java.util.Arrays;

/**
 * @author Subash
 * Given an array S of n integers, find three integers in S such that 
 * the sum is closest to a given number, target. Return the sum of the
 *  three integers. You may assume that each input would have exactly 
 *  one solution.
 *  
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
	    int min = Integer.MAX_VALUE;
		int result = 0;
	 
		Arrays.sort(nums);
	 
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = Math.abs(sum - target);
	 
				if(diff == 0) return sum;
	 
				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum <= target) {
					j++;
				} else {
					k--;
				}
			}
		}
	 
		return result;
	}
	
public static void main(String[] args) {
		
		int array2[]={-1, 2, 1, -4};
		int target = 1;
		int result =  new ThreeSumClosest().threeSumClosest(array2, target);
		System.out.println(" result : " + result);
	}
}
