/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * @author a052374
 *
 */
public class BinarySearchIterative {

	public int binarySearch(int[] array, int key){
		
		if(array.length == 0)
			return -1;
		
		if(array.length == 1){
			if(key == array[0])
				return 0;
		}
		
		int begin = 0;
		int end = array.length-1;
		
		while(begin <=end){
			int mid = (begin+end)/2;
			if(array[mid] == key){
				return mid;
			} else if( array[mid]>key){
				end = mid-1;
			} else
				begin = mid+1;			
		}		
		return -1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,3,9,11,15,19,29};
		int key = 25;
		//int key = 15;
		
		int result = new BinarySearchIterative().binarySearch(array, key);
		System.out.println("result: " + result);

	}

}
