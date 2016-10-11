/**
 * 
 */
package jyosh.leetcode.problems.others;

/**
 * @author Subash
 * Follow up for ”Search in Rotated Sorted Array”: What if duplicates are allowed?
	Would this affect the run-time complexity? How and why?
	Write a function to determine if a given target is in the array.
 *
 */
public class SearchInRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {
		int first = 0;
		int last = nums.length;
		while (first != last) {
			int mid = first + (last - first) / 2;
			if (nums[mid] == target)
				return true;
			if (nums[first] < nums[mid]) {
				if (nums[first] <= target && target < nums[mid])
					last = mid;
				else
					first = mid + 1;
			} else if (nums[first] > nums[mid]) {
				if (nums[mid] < target && target <= nums[last - 1])
					first = mid + 1;
				else
					last = mid;
			} else
				// skip duplicate one
				first++;
		}
		return false;
	}

	public static void main(String[] args) {

		// int array[]={4, 5, 6, 7, 0, 1, 2};
		// int array[]={1,3};
		// int array[]={1,1,3};
		int array[] = { 1, 1, 1, 3, 1 };
		// int array[]={1,3,1,1};

		// int array[]={1};
		boolean result = new SearchInRotatedSortedArrayII().search(array, 3);
		System.out.println(" result: " + result);

	}
}
