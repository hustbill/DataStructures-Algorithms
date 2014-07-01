

import java.io.*;
import java.util.*;


/**
 * Gemotric progression 
 * @author hua.zhang
 *
 */
public class GeomProgression extends Progression{
	
	/** base */
	protected long base;
	//Inherits variables first and cur.
	
	/** Default constructor setting base 2. */
	GeomProgression() {
		this(2);
	}
	
	/**
	 * Parametric constructor providing the base. 
	 * 
	 *  @param b based of the progression.
	 */
	GeomProgression(long b) {
		base = b;
		first = 1;
		cur  = first;
	}
	
	/** Advances the progression by multiplying the base with the current value.
	 * 
	 *  @return next value of the progression
	 * 
	 */
	protected long nextValue() {
		cur *= base;
		return cur;
	}
	
	//Inherits methods firtValue() and printProgression(int).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeomProgression gp = new GeomProgression();
		gp.base =2;
		gp.printProgression(5);
		gp.printProgression(36);
		
		ArithProgression ap = new ArithProgression();
		ap.inc = 2;
		ap.printProgression(5);
		ap.printProgression(36);
		
		Progression p = new Progression();
		p.printProgression(5);
		p.printProgression(36);
	}
}
