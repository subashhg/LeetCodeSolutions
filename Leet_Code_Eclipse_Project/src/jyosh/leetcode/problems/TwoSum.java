/**
 * 
 */
package jyosh.leetcode.problems;

import jyosh.leetcode.exception.IlligalArgumentException;


/**
 * @author Subash
 *
 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target){
		int[] indexes = {-1,-1};
		
		boolean found = false;
		for(int i=0 ;i<nums.length-1 ; i++){			
			for(int j=i+1 ;j<nums.length ; j++){
				if(nums[i]+nums[j] == target){
					found = true;
					indexes[0] = i;
					indexes[1] = j;
					break;
				}				
			}			
			if(found){				
				break;
			}			
		}	
		return indexes;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[]={1, 5, 6, 4};
		int target = 20;
		
		int[] results =  new TwoSum().twoSum(array, target);
		System.out.println("indexes : " + results[0] + " and " + results[1]);
	}

}
