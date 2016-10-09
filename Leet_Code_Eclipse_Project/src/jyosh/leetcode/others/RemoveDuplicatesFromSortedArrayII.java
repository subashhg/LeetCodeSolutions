/**
 * 
 */
package jyosh.leetcode.problems.others;

/**
 * @author Subash
 *
 */
public class RemoveDuplicatesFromSortedArrayII {
	
	public int removeDuplicates(int[] nums) {
		int arrLength = nums.length;
		if (arrLength <= 2) return arrLength;
		int index = 2;
		for (int i = 2; i < arrLength; i++){
		if (nums[i] != nums[index - 2])
		nums[index++] = nums[i];
		}
		return index;		
	}
	
	

	public static void main(String[] args) {
		
		//int array[]={1,1,2,2,3,3,4,4 };
		//int array[]={1,2,3,4,5};
		//int array[]={1,1,1,1,1,1};
		int array[]={1,1,1,1,1,1,2};
			//int array[]={2};
		//int array[]={1,1,2,3};
		int result =  new RemoveDuplicatesFromSortedArrayII().removeDuplicates(array);
		System.out.println(" unique count : " + result);
		System.out.println(" Array from methodd 1 ");
		printArray(array, result);
		
		
		
	}

	private static void printArray(int[] array, int loopCount) {

		for(int i=0; i<loopCount ; i++){
			System.out.print(" " + array[i]);			
		}
		System.out.println(" ");
	}
}
