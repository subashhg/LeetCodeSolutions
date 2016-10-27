/**
 * 
 */
package jyosh.leetcode.solutions.java;


/**
 * @author Subash
 * Implement next permutation, which rearranges numbers into the 
 * lexicographically next greater permutation of numbers.
	If such arrangement is not possible, it must rearrange it as the 
	lowest possible order (ie, sorted in ascending order).
	The replacement must be in-place, do not allocate extra memory.
	Here are some examples. Inputs are in the left-hand column and its
	corresponding outputs are in the right-hand column.
	1,2,3 → 1,3,2
	3,2,1 → 1,2,3
	1,1,5 → 1,5,1
 *
 */
public class NextPermutaion {

	public static int[] nextPermutation(int[] num) {
        int i = 0;
        int j = 0;
        //From right to left, find the first one that is not in ascending order.
        for (i = num.length - 2; i >= 0; i--) {
            if (num[i] >= num[i + 1])
                continue;
            //From right to left, find the first one that is larger than num[i]
            for (j = num.length - 1; j > i; j--) {
                if (num[j] > num[i])
                    break;
            }
            break;
        }
        //If we find i, swap the number on position i and j
        if (i >= 0) {
            int tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
        }
        //Reverse the numbers which are on the right of i
        int start = i + 1;
        int end = num.length - 1;
        while (start < end) {
            int tmp = num[start];
            num[start] = num[end];
            num[end] = tmp;
            start++;
            end--;
        }
        return num;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int array[]={6,8,7,4,3,2};
		int array[]={6,8,7,9,9,9};
		int [] result =  nextPermutation(array);
		for(int num: result){
			System.out.print(num + "," );
		}
	}
}
