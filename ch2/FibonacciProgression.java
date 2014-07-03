
import java.io.*;
import java.util.*;


/**
 * Fibonacci Progression
 * @author hua.zhang
 *
 */
public class FibonacciProgression extends Progression {
	/** Previous value */
	long prev;
	
	//Inherits variables first and cur.
	
	/** Default constructor setting 0 and 1 as the first two values. */
	FibonacciProgression() {
		this(0,1);
		
	}
	
/** Parametric constructor providing the first and second values .
 * 
 * @param value1 first value.
 * @param value2 second value.
 */
	FibonacciProgression(long value1, long value2) {
		first = value1;
		prev = value2 - value1;  // fictious value preceding the first
	}
	
	/** Advances the progression by adding the previous value to the current value.
	 * 
	 * @return next value of the progression
	 */
	protected long nextValue() {
		long temp = prev;
		prev = cur;
		cur += temp;
		return cur;
		
	}

//	public static void main(String[] args) {
//		FibonacciProgression fp = new FibonacciProgression();
//		fp.prev = 7;
//		fp.printProgression(3);
//		fp.printProgression(24);
//		
//		ArithProgression ap = new ArithProgression();
//		ap.inc = 2;
//		ap.printProgression(3);
//		ap.printProgression(12);
//		
//		Progression p = new Progression();
//		p.printProgression(3);
//		p.printProgression(12);
//	}
	
}
