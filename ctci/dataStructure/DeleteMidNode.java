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
		boolean result = deleteMidNode( dl, k );
		System.out.println();
		System.out.print(result);
		
		
		Node n = deleteMidNodeExec( dl, k );
		while(n.next  != null && n.next.next !=null) {	
			System.out.print("->");
			System.out.print(n.next.data);		
			n.next = n.next.next;
		}
		
	}
	
	public static boolean  deleteMidNode( Node n, Node k) {
		if ( k == null || k.next == null) {
			return false ; /// Failure
		}  
		 Node next = k.next;
		 n.data = next.data;
		 n.next = next.next; 
		 return true;
	}
	
	public static Node  deleteMidNodeExec( Node n, Node k) {
		if ( k == null || k.next == null) {
			return null ; /// Failure
		}  
		 Node next = k.next;
		 n.data = next.data;
		 n.next = next.next; 
		 return next;
	}
}
