/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * @author Subash
 *
 */
public class FibonacciNumberGenerator {
	
	/**
	 * 
	 * @param position
	 * @return
	 */

	int getFibonacci(int position){
		int fib =0;
		if(position == 0)
			return 0;
		if(position == 1)
			return 1;
		fib = getFibRec(0, 1, 2, position);
		
		return fib;		
	}
	
	/**
	 * 
	 * @param first
	 * @param second
	 * @param loopCount
	 * @param position
	 * @return
	 */
	
	private int getFibRec(int first, int second, int loopCount, int position) {
		int result = 0;
		if(loopCount == position){
			result = first+second;
		}else{
			result = getFibRec(second, first+second, ++loopCount, position);
		}		
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int result = new FibonacciNumberGenerator().getFibonacci(9);
		System.out.println("result: "+ result);

	}

}
