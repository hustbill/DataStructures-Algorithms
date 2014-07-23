package dataStructure;


import java.util.Hashtable;


//2.1 remove duplicates from an unsorted linked list
public class rmDupsFromLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node dl = new Node(10);
		for(int i=0; i<10; i++) 
	    dl.appendToTail(i);
//		Node header = new Node("hello", null, null);
//		dl.addFirst(header);
//		DNode trailer = new DNode("world", null, null);
//		dl.addLast(trailer);		
		//System.out.println(dl.next.data);
		
		//dl.next = dl.next.next;
		
		deleteDups(dl);
		System.out.println();
		for(int i=3; i<21; i++) 
		    dl.appendToTail(i);
		deleteDups(dl);
		
	}
	
	
	public static void deleteDups(Node n) {
		Hashtable table = new Hashtable();
		Node previous = null;
		while( n != null) {
			if(table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				//table.put(key, null)
				previous = n;
			}
			n = n.next;
		}
		
		System.out.print(table);
	}
	Node deleteNode(Node head, int d) {
		Node  n = head;
		
		if(n.data == d) {
			return head.next;	 /* moved head */
		}
		
		while(n.next !=null) {
			if(n.next.data == d){
				n.next = n.next.next;
				return head; 		/* head didn't change */
			}
			n = n.next;
		}
		return head;
	}

}
