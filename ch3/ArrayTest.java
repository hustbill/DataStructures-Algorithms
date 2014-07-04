/** 
 *  A simple test of some built-in methods in java.util.Arrays
 * 
 * @author hua.zhang
 *
 */

import java.util.Arrays;
import java.util.Random;

/**  Program  showing some array  uses. */ 
public class ArrayTest {
	public static void main(String[] args) {
		int num[] = new int[0];
		Random rand = new Random();   // a pseudo-random number generator
		rand.setSeed(System.currentTimeMillis());	// use current time as seed
		//fill the num array with pseudo-random numbers from 0 to 9, inclusive
		for (int i=0; i < num.length; i++) 
			num[i] = rand.nextInt(100);  // the nxt pseudo-random number
		int[] old = (int[]) num.clone();		//cloning the num array
		System.out.println("arrays equal before sort: " + Arrays.equals(old, num));
		Arrays.sort(num);	//	sorting the num array ( old is unchanged)
		System.out.println("arrays equal after sort: " + Arrays.equals(old, num));
		System.out.println("old = " + Arrays.toString(old));
		System.out.println("num = " + Arrays.toString(num));
		
	}
	
}
