/**
 * 
 */
package jyosh.leetcode.problems.mine;

/**
 * @author Subash
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	You are given a target value to search. If found in the array return its index, otherwise return -1.
	You may assume no duplicate exists in the array.
 *
 */
public class SearchInRotatedSortedArray {
	
	/**
	 * This method uses binary search and recursive calls to self 
	 * find the target
	 * @param nums  -- its array that is sorted and may be rotated 
	 * @param target  -- number to be searched
	 * @param parmTargetIndex -- initially this will be -1 till any subsequent calls 
	 * to self or to binary search method returns otherwise
	 * @param low - initially this will start with 0 representing starting index of array
	 * later changes as per the logic in subsequent calls
	 * @param high - initially this will start with (array length - 1) representing last index of array
	 * later changes as per the logic in subsequent calls
	 * @return index of the target element if found or -1
	 */
	public int searchTarget(int[] nums, int target, int parmTargetIndex, int low, int high) {

		int targetIndex = parmTargetIndex;
		
		if (targetIndex != -1)
				return targetIndex;		
		
		if (low == high)
			return (nums[high] == target) ? high : -1;
		

		int mid = (low + high) / 2;
		
		if (nums[mid] == target) 
			return mid;
		
		if (mid == low) {
			return (nums[high] == target) ? high : -1;
		}

		if ((nums[low] <= nums[mid - 1])) {
			targetIndex = binarySearch(nums, target, low,mid-1);
		} else {
			targetIndex = searchTarget(nums, target, targetIndex, low, mid-1);
		}

		if (targetIndex == -1) {
			if ((nums[mid + 1] <= nums[high])) {
				targetIndex = binarySearch(nums, target, mid + 1, high);
			} else {
				targetIndex = searchTarget(nums, target, targetIndex, mid + 1, high);
			}
		}

		return targetIndex;
	}
   
   /**
    * 
    * @param sorted array
    * @param key  to find
    * @param low starting index of array
    * @param high ending index of array
    * @return
    */
   public static int binarySearch(int[] a, int key, int  low, int high) {
       int lo = low;
       int hi = high;
       while (lo <= hi) {
           // Key is in a[lo..hi] or not present.
           int mid = lo + (hi - lo) / 2;
           if      (key < a[mid]) hi = mid - 1;
           else if (key > a[mid]) lo = mid + 1;
           else return mid;
       }
       return -1;
   }
   
   /**
	 * This method is a plain iterative search
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchIterative(int[] nums, int target) {
		
		int targetIndex = -1;
		int arrayLen = nums.length;
		
		for(int i=0;i < arrayLen;i++){
			if(nums[i]==target){
				targetIndex = i;
				break;
			}
		}		
		return targetIndex;        
   }
	
   
   
   public int search(int[] nums, int target) {
       return searchTarget(nums, target, -1, 0, nums.length-1);
   }
   
   public static void main(String[] args) {
		
		//int array[]={4, 5, 6, 7, 0, 1, 2};
		//int array[]={1,3};
	   //int array[]={1,3,5};
	   	int array[]={3,4,5,6,1,2};
	   
			   
	   	//int array[]={1};
		int result2 =  new SearchInRotatedSortedArray().search(array,2);
		System.out.println(" index: " + result2);
		
	}

}
