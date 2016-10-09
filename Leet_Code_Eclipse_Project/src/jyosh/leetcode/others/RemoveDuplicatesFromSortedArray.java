/**
 * 
 */
package jyosh.leetcode.problems.others;

/**
 * @author Subash
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] != nums[i])
				nums[++index] = nums[i];
		}
		return index + 1;
	}

	public static void main(String[] args) {

		// int array[]={1,1,2,2,3,3,4,4 };
		// int array[]={1,2,3,4,5};
		// int array[]={1,1,1,1,1,1};
		// int array[]={1,1,1,1,1,1,2};
		// int array[]={2};
		int array[] = { 1, 1, 2, 3 };
		int result = new RemoveDuplicatesFromSortedArray()
											.removeDuplicates(array);
		System.out.println(" unique count : " + result);
	}

}
