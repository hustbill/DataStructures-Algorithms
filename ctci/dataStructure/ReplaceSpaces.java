/**
 * 
 */
package dataStructure;

/**
 * @author Hua Zhang, July 24, 2014
 *  Question： i still don't know why use  two  scan approach. , what's the value of length?
 */
public class ReplaceSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] str = { 'a', ' ', 'g','o','o','d',' ', 'b', 'o','y'};
		int length =21;
		//System.out.println(str);
		replaceSpaces(str, length);
		//System.out.println(str);
	}
	
	public static void replaceSpaces(char[] str, int length) {
		int spaceCount =0, newLength, i =0;
		for(i=0; i< length; i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = spaceCount*2 + str.length;
		str[newLength] = '\0';
		for(i=length -1 ; i >=0; i--) {   // backward
			if(str[i] == ' ') {
				str[newLength -1] = '0';
				str[newLength -2] = '2';
				str[newLength -3] = '%';
				newLength = newLength -3;
			}
			else {
				str[newLength -1] = str[i];
				newLength = newLength -1 ;
			}
		}
	}

}
