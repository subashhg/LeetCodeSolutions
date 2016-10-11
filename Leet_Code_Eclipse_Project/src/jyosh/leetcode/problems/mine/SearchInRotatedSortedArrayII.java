/**
 * 
 */
package jyosh.leetcode.problems.mine;

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
			if(nums[first] == nums[mid] && nums[first] == nums[last-1] ){
				 /** if there is no patter identified
				 * then use linear search on the sub array*/
				return linearSearch(nums, target, first, last);
			}
			if(nums[first] == nums[mid]){
				if(nums[mid] == nums[last-1])
					last = mid;
				else
					first = mid+1;
			}
			else if (nums[first] <nums[mid]) {
				if (nums[first] <= target && target <= nums[mid])
					last = mid;
				else
					first = mid + 1;
			} else {
				if (nums[mid] <= target && target <= nums[last - 1])
					first = mid + 1;
				else
					last = mid;
			}
		}
		return false;
	}
	
	
	/**
	 * @param nums
	 * @param target
	 * @return
	 */
	public boolean linearSearch(int[] nums, int target, int startIndex, int endIndex) {
		
		boolean targetIndex = false;
		for(int i=startIndex;i < endIndex;i++){
			if(nums[i]==target){
				return true;
			}
		}		
		return targetIndex;        
   }
	
	  public static void main(String[] args) {
			
			//int array[]={4, 5, 6, 7, 0, 1, 2};
			//int array[]={1,3};
		   		//int array[]={1,1,3};
		   		int array[]={1,1,1,3,1};
		   	//int array[]={1,3,1,1};
		   
				   
		   	//int array[]={1};
			boolean result =  new SearchInRotatedSortedArrayII().search(array,3);
			System.out.println(" index: " + result);
			
		}
}
