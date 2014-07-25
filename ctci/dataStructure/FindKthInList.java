/*
 * 2.2 implement an algorithm to find the kth to last element of a singly linked list
 * 
 */

package dataStructure;

import java.util.LinkedList;
import java.util.List;


public class FindKthInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node dl = new Node(10);
		for(int i=0; i<10; i++) 
	    dl.appendToTail(i);
		int rt = nthToLast(dl, 2);
	}
	
 //public static int nthToLast(LinkedListNode head, int k) {
	public static int nthToLast(Node head, int k) {
	
		
	  if(head == null) {
		  return 0;
	  }
	  int i = nthToLast(head.next, k) +1;
	  if(i==k) {
		  System.out.println(head.data);
	  }
	  return i;	
 }
	
}
