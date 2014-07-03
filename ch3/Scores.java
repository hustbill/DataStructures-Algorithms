
/** 
 * Class for storing high scores in an array in non-decreasing order
 * @author hua.zhang
 *
 */
public class Scores {
	public static final int maxEntries  = 10 ;	//nuber of high scores we keep
	protected int numEntries;		//number of actual entries
	protected GameEntry[]  entries;	 //array of game entries (name & scores) 
	/** Default constructor	*/
	public Scores() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}
	/** Returns a string representation of the high scores list */
	public String toString() {
		String s = "[";
		for(int i =0; i < numEntries ; i++) {
			if(i > 0)  s +=  ", ";    //separate entries by commas
				s += entries[i];
		}
		return s + "]";		
		
	}
	// ... method for updating the set of high scores go here ...
}
