
/** 
 * Class for storing high scores in an array in non-decreasing order
 * @author hua.zhang
 *
 */
<<<<<<< HEAD
public class Scores  {
=======
public class Scores {
>>>>>>> e4e8dad348a39f52107b56fe92c92a74258f430a
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
<<<<<<< HEAD
	public GameEntry remove(int i ) throws IndexOutOfBoundsException {
		if((i < 0) || (i > numEntries) )
			throw new IndexOutOfBoundsException("Invalid index: "  + i);
		GameEntry temp = entries[i];  	// temporarily save the object to be removed
		for( int j = i; j < numEntries -1 ; j++) 
			entries[j] = entries[j+1];  	//move one cell to the left
		entries[numEntries - 1] = null;    //null out the old last score
		numEntries--;
		return temp;		// return rthe removed object
		
	}
	
=======
>>>>>>> e4e8dad348a39f52107b56fe92c92a74258f430a
}
