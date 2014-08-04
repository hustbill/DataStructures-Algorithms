package dataStructure;

import java.util.LinkedList;

/*
 *  2.4 Write code to partition a linked list around a value x, such that all nodes less than x
 *  come before all nodes greater than or equal to x.
 */
public class PartLinkedList {
	
	public static void main(String[] args){
		Node dl = new Node(10);
		dl.appendToTail( 10);
		dl.appendToTail(21);
		dl.appendToTail(34);
		dl.appendToTail(47);
		dl.appendToTail(59);
		System.out.println("before");
		while(dl.next  != null) {	
			System.out.print("->");
		System.out.print(dl.next.data);		
		dl.next = dl.next.next;
		}
		
		int x =22;
		Node s = partition(dl, x);
		System.out.println();
		System.out.println("after!!");
		while(s.next  != null) {	
			System.out.print("->");
			System.out.print(s.next.data);		
			//s.next = s.next.next;
		}
	}

	public static Node partition(Node node, int x) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		
		/* 
		 * Partition list
		 */
		while(node != null) {
			Node next = node.next;
			node.next = null;
			if(node.data < x) {
				// Insert node into end of before list 
				if(beforeStart == null){
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}				
			} else {
				// Insert node into end of after list
				if(afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				}else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		
		if(beforeStart == null) {
			return afterStart;
		}
		// Merge before list and after list 
		beforeEnd.next = afterStart;
		System.out.println(beforeEnd.data);
		return beforeStart;
		
	}
//	public static Node partLinkedList(Node n, int x ) {
//		
//		Node sortList =  new Node(x);
//		System.out.println("\n"+ n.data);
//		if (n.data >= x) {
//			System.out.println(n.data);
//			sortList.appendToTail(n.data);
//			sortList.next = n;
//		
//			return sortList;
//		}
//		else {
//			n.appendToTail(x);
//			n.next = sortList;
//			return n;
//		}
//		
//		//return sortList;
//		//n.next = n.next.next;
//	}
	
}
