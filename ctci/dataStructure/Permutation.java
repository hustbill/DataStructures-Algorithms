package dataStructure;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "hello world";
//		String b = "dlrow olleh";
		
		String a = "hello world";
		String b = "dlro0 olleh";
		boolean flag = permutation(a, b);
		System.out.print(flag);
		
		String c= sort(a);
		System.out.print(c);
	}
	
	public static boolean billy_checkPermutation(String a, String b) {
		if (a.length() != b.length())
			return false;
			else if(a.startsWith(b.substring(b.length()), 
				0))
			System.out.println(" a is the permutation of b");
			//return true;
		return true;
		
	}
	public static String  sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation1(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		return sort(a).equals(sort(b));
	}

	//Solution #2 : check if the two strings have identical character counts.
	public static boolean permutation(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		
		int[] letters = new int[256];    //Assumption
		// in your interview, you should always check with your interviewer about the size of the character set.
		// we assumed that the character set was ASCII.
		
		char[] a_array = a.toCharArray();
		
		for(char c : a_array) {  // count number of each char in a.
			letters[c]++;
			System.out.print(c);
		System.out.println(letters[c]);
		
	
		 
		}
		System.out.println("********");
		
		
		for(int i=0; i< b.length(); i++) {
			int c = (int)b.charAt(i);
			System.out.print(b.charAt(i));
			System.out.print(letters[c]);
			System.out.println();
			if(--letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
	
}
