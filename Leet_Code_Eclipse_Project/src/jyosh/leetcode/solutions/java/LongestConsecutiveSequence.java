/**
 * 
 */
package jyosh.leetcode.solutions.java;

import java.util.HashSet;
import java.util.Set;

import jyosh.leetcode.problems.mine.TwoSum;

/**
 * @author Subash
 * 
 * Longest Consecutive Sequence
 * 
 * 	Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
	For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1,
	2, 3, 4]. Return its length: 4.
	Your algorithm should run in O(n) complexity.
 *
 */
public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[] array) {
		// if array is empty, return 0
		if (array.length == 0) {
			return 0;
		}
	 
		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
	 
		for (int num : array)
			set.add(num);
	 
		for (int num : array) {
			int leftNum = num - 1;
			int rightNum = num + 1;
			int count = 1;
	 
			while (set.contains(leftNum)) {
				count++;
				set.remove(leftNum);
				leftNum--;
			}
	 
			while (set.contains(rightNum)) {
				count++;
				set.remove(rightNum);
				rightNum++;
			}
	 
			max = Math.max(count, max);
		}
	 
		return max;
	}

  public static void main(String[] args) {
		
		int array[]={1, 5, 6, 4};
		int result =  longestConsecutive(array);
		System.out.println("result: " + result );
	}
}
