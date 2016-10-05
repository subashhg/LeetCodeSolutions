/**
 * 
 */
package jyosh.leetcode.problems.mine;

/**
 * @author Subash
 *
 */
public class RemoveDuplicatesFromSortedArray {
	
	public int removeDuplicates(int[] nums) {
		int count = 0;
		if (nums == null || nums.length == 0)
			return 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				nums[++count] = nums[i];
			} else {
				if (i < nums.length - 1) {
					int[] resutls = findNextNonDuplicateNumber(nums, i + 1);
					if (resutls[1] != -1) {
						nums[++count] = resutls[0];
						i = resutls[1];
					}else
						i=nums.length;
				}
			}
		}
		for (int i = 0; i < count + 1; i++) {
			System.out.println(nums[i]);
		}
		return count + 1;
	}
	 
	private int[] findNextNonDuplicateNumber(int[] nums, int i) {
		int[] results = new int[] {-1, -1 };
		for (int j = i; j < nums.length; j++) {
			if (nums[j - 1] != nums[j]) {
				results[0] = nums[j];
				results[1] = j;
				break;
			}
		}
		return results;
	}

	public static void main(String[] args) {
			
			//int array[]={1,1,2,2,3,3,4,4 };
			//int array[]={1,2,3,4,5};
			//int array[]={1,1,1,1,1,1};
			//int array[]={1,1,1,1,1,1,2};
				//int array[]={2};
			int array[]={1,1,2,3};
			int result =  new RemoveDuplicatesFromSortedArray().removeDuplicates(array);
			System.out.println(" unique count : " + result);
		}

}
