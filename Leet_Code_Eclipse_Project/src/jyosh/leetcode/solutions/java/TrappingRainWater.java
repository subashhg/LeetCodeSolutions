/**
 * 
 */
package jyosh.leetcode.solutions.java;

/**
 * @author Subash
 * 
 * Given n non-negative integers representing an elevation map where the width 
 * of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 *
 *To find the trapped water at position i, we need to find the maximum value of 
 *the left elements of i and right elements of i. Assuming they are maxLeft[i]
 * and maxRight[i]. The trapped water is min(maxLeft[i], maxRight[i]) – A[i] 
 * (if this value is larger than 0).
 */
public class TrappingRainWater {
	
public int trap(int[] array) {
        
        
        if (array.length == 0)
            return 0;
        int[] maxLeft = new int[array.length];
        int[] maxRight = new int[array.length];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            maxLeft[i] = max;
            if (array[i] > max)
                max = array[i];
        }
        max = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            maxRight[i] = max;
            if (array[i] > max)
                max = array[i];
        }
        int ret = 0;
        for (int i = 1; i < array.length - 1; i++) {
            int trap = Math.min(maxLeft[i], maxRight[i]) - array[i];
            if (trap > 0)
                ret += trap;
        }
        return ret;
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]={0,1,0,2,1,0,1,3,2,1,2,1};
		int result =  new TrappingRainWater().trap(array);
		System.out.println(" result : " + result);

	}

}
