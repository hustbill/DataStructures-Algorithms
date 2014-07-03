
/**
 * GameEntry
 * 
 * @author hua.zhang
 *
 */
public class GameEntry {

	protected String name;   	// name of the person earing this score
	protected int score;		//the score value
	/** Constructor to create a game entry */
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}
	/** Retrieves the name field */
	public String getName() { return name;}
	/** Retrieves the score field */
	public int getScore() { return score;}
	/** Returns a string representation of this entry*/
	public String toString() {
		return "(" + name + "," + score + ")";
	}
	

}
