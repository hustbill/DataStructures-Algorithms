/**
 * Test program for GameEntry class
 *  
 * @author hua.zhang
 *
 */
public class TestGameEntry {
	

	// i = 3, numEntries =10
	// j=3;
	// entries[3] = entries[4]'
	// entries[9 ] = null
	// numEntries = 9;
	
	// j=4;  numEntries =9;
	// entries[4] = entries[5];
	// entries[8] = null
	// numEntries = 8;
	
	public static void insertionSort(char[] a) {
		int n = a.length;
		for (int i =1; i < n; i++) {	//index from the second character in a
			char cur = a[i] ; 			// the current character to be inserted
			int j = i -1; 				// start comparing with cell left of i
			while((j >=0) && (a[j]  > cur) ) // while a[j] is out of order with cur
				a[j+1] = a[j--];		// move a[j] right and decrement j
			a[j+1] = cur; 				// this is the proper place for cur
		}
		for(int k=0; k < a.length; k++) {
			System.out.print(a[k] + ", ");
		}
		//System.out.print(a);
	}
	
	public static void main(String[] args) {
		char[] a = {'C', 'B', 'C', 'D', 'A', 'E', 'H', 'G','F'};
		insertionSort(a);
		
		
	}

	
}
