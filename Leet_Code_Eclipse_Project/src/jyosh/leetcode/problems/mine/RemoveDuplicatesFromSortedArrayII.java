/**
 * 
 */
package jyosh.leetcode.problems.mine;

/**
 * @author Subash
 *
 */
public class RemoveDuplicatesFromSortedArrayII {
	
	/**
	 * This method maintains a counter to see if a similar 
	 * element already exits in previous location
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int index = 0;
		int prevCount = 1;
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i] != nums[i-1])) {
				nums[++index] = nums[i];
				prevCount = 1;
			}
			else if (prevCount==1){
				nums[++index] = nums[i];
				prevCount = 2;
			}
		}
		return index + 1;
	}
	
	/**
	 * This method is even more simplified
	 * copies the element to array only if any of its
	 * neighbor is different in the parent array.
	 * and also copies the last element by default as
	 *  duplicate is allowed
	 * @param nums
	 * @return
	 */
	
	public int removeDuplicates2(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i] != nums[i-1]) ||(i == nums.length-1) ||(nums[i] != nums[i+1])) {
				nums[++index] = nums[i];				
			}
		}
		return index + 1;
	}

	public static void main(String[] args) {
		
		//int array[]={1,1,2,2,3,3,4,4 };
		//int array[]={1,2,3,4,5};
		//int array[]={1,1,1,1,1,1};
		int array[]={1,1,1,1,1,1,2};
			//int array[]={2};
		//int array[]={1,1,2,3};
		/*int result =  new RemoveDuplicatesFromSortedArrayII().removeDuplicates(array);
		System.out.println(" unique count : " + result);
		System.out.println(" Array from methodd 1 ");
		printArray(array, result);*/
		
		int result2 =  new RemoveDuplicatesFromSortedArrayII().removeDuplicates2(array);
		System.out.println(" unique count from 2: " + result2);
		System.out.println(" Array from methodd 2 ");
		printArray(array, result2);
		
	}

	private static void printArray(int[] array, int loopCount) {

		for(int i=0; i<loopCount ; i++){
			System.out.print(" " + array[i]);			
		}
		System.out.println(" ");
	}
}
