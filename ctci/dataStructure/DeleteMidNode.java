package dataStructure;

import java.util.List;

public class DeleteMidNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	
		Node k = new  Node(1);
		k.appendToTail(21);
		Node result = deleteMidNode( dl, k );
		System.out.println();
		System.out.println("delete");
		while(result.next  != null) {	
			System.out.print("->");
		System.out.print(result.next.data);		
		result.next = result.next.next;
		}
	
	}
	
	public static Node  deleteMidNode( Node n, Node k) {
		if ( k.next == null) return null ;
			  
		  Node prev = new Node(1);
		  prev.next = k;	  
		 Node next = k.next;		 
		  prev.next = next;		 
		  
		  
		return prev;
		
		
	}
}
