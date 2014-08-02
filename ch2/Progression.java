/**
 *  A class for numeric progression
 * @author hua.zhang
 *
 */
public class Progression {

	protected long first;  //First value of the progression
	
	protected long cur;  // Current value of the progression
	
	Progression() {    // Default constructor
		cur = first = 0 ;  
	}
	
	//Reset the progression to the first value.
	protected long firstValue(){
		cur = first ;
		return cur;
	}
	
	/**
	 * Advances the progression to the next value.
	 * @param return next value of the progression
	 */
	protected long nextValue() {
		return ++cur;     // default next value
	}
	
	/**
	 * Prints the first n value of the progression.
	 * @param n number of values to print
	 */
	protected void printProgression(int n) {
		System.out.print(firstValue());
		System.out.println(); 
		for(int i=2; i<=n ; i++) 
			System.out.print(" " + nextValue());
		System.out.println();   //ends the line
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Progression p = new Progression();
//		p.printProgression(5);
//		p.printProgression(36);
//		
//
//	}

}
