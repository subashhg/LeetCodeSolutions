/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * @author Subash
 *
 */
public class QuickSort {

	public void sort(int[] array, int begin, int end){
		// below if condition is exit condition
		if(array.length==0 || array.length==1 || begin>=end){
			return;
		}else{ // else loop is where the pivot of sub array is placed to its location
			int pivotPos = end;
			int pivot = array[pivotPos];			
			for(int i = begin; i<pivotPos;){
				if(array[i]>pivot){
					int temp = array[pivotPos-1];
					array[pivotPos-1] = array[pivotPos];
					if (i != pivotPos - 1) {
						array[pivotPos] = array[i];
						array[i] = temp;
					}else
						array[pivotPos] = temp;
					pivotPos = pivotPos-1;
				}else{
					i++;
				}
			}
			if(pivotPos == begin){ // if the pivot was moved all the way to the begining
				sort(array, begin+1, end);
			}else if(pivotPos == end){// if the pivot didnt move at all
				sort(array, begin, end-1);
			}
			else { // average case where the pivot moved to somewhere in between
				sort(array, begin, pivotPos-1);
				sort(array, pivotPos+1, end);
			}
				
		}	
		
		
	}
	
	private static void printArray(int[] array, int loopCount) {

		for(int i=0; i<loopCount ; i++){
			System.out.print(" " + array[i]);			
		}
		System.out.println(" ");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {21, 4, 1, 3, 9, 20, 25, 6, 21, 14};
		new QuickSort().sort(array, 0, array.length-1);
		printArray(array, array.length);
	}
	
	

}
