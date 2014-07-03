
/**
 * Arithmetic progression
 * @author hua.zhang
 *
 */
public class ArithProgression extends Progression {

	/** Increment */
	protected long inc;
	
	//Inherits variable first and cur.
	
	/** Default constructor setting a unit increment. */
	ArithProgression() {
		this(1);
	}
	
	/** Parametric constructor providing the increment. */
	ArithProgression(long increment) {
		inc =  increment;
	}
	
	
	/** Advances the progression  by adding the increment to the current value.
	 * polymorphism  with the nextValue() in father class. 
	 * 
	 * @return next value of the progression
	 */
	protected long nextValue(){
		cur += inc;
		//System.out.println(" polymorphism");
		return cur;		
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArithProgression ap = new ArithProgression();
//		ap.inc = 2;
//		ap.printProgression(5);
//		ap.printProgression(36);
//		
//		Progression p = new Progression();
//		p.printProgression(5);
//		p.printProgression(36);
//	}

}
