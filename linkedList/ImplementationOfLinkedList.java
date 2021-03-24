package linkedList;

public class ImplementationOfLinkedList {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		
		Node temp1 = new Node(15);
		
		Node temp2 = new Node(20);
		
		head.next = temp1;
		
		temp1.next = temp2;
		
		System.out.println("Linked list is created");
		
		printLinkedList(head);
		
		head = insertAtBegin(head, 5);
		
		printLinkedList(head);
		
		head = insertAtEnd(head, 25);
		
		printLinkedList(head);
		
//		head = deleteFirstNode(head);
//		
//		printLinkedList(head);
//		
//		head = deleteLastNode(head);
//		
//		printLinkedList(head);
		
		int searchVal = -1;
		System.out.println("\nposition of " + searchVal + " in list is: " + serachIterative(head, searchVal));
		System.out.println("position of " + searchVal + " in list is: " + serachRecursive(head, searchVal, head, 1));
		
		System.out.println();
		printLinkedList(head);
		System.out.println("mid value of list is: " + midValue(head));
		head = insertAtEnd(head, 30);
		System.out.println();
		printLinkedList(head);
		System.out.println("mid value of list is: " + midValue(head));
		
		int fromLastIndex = 3;
		System.out.println("\n" + fromLastIndex + " node from the end of linked list is: " + nthNodeFromEnd(head, fromLastIndex));
		
		Node reverseLL = reverseLLIterative(head);
		printLinkedList(reverseLL);
	}
	
	public static void printLinkedList(Node head) {
		Node curr = head;
		
		while(curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println(" are the all values of linked list.");
	}

	public static Node insertAtBegin(Node head, int x) {
		
		Node node = new Node(x);
		node.next = head;
		
		System.out.println();
		System.out.println("inserting " + x + " at the start of linked list");
		
		return node;
	}
	
	public static Node insertAtEnd(Node head, int x) {
		Node curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		
		curr.next = new Node(x);
		
		System.out.println();
		System.out.println("inserting " + x + " at the end of linked list");
		
		return head;
	}
	
	public static Node deleteFirstNode(Node head) {
		head = head.next;
		
		System.out.println();
		System.out.println("Deleting the first node of the linked list");
		
		return head;
	}

	public static Node deleteLastNode(Node head) {
		
		if(head == null) {
			return head;
		}
		if(head.next == null) {
			return null;
		}
		
		Node curr = head;
		
		while(curr.next.next != null) {
			curr = curr.next;
		}
		
		curr.next = null;
		
		System.out.println();
		System.out.println("Deleting the last node of the linked list");
		
		return head;
	}

	public static int serachIterative(Node head, int val) {
		int pos = 1;
		Node curr = head;
		
		while(curr.val != val && curr.next != null) {
			curr = curr.next;
			pos++;
		}
		
		return curr.val == val ? pos : -1;
	}

	public static int serachRecursive(Node head, int val, Node curr, int pos) {
		if(curr.val == val) {
			return pos;
		}
		
		if(curr.next == null) {
			return -1;
		}
		
		return serachRecursive(head, val, curr.next, pos + 1);
	}

	public static int midValue(Node head) {
		if(head == null) {
			return -1;
		}
		
		Node slow = head;
		
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.val;
		
	}

	public static int nthNodeFromEnd(Node head, int n) {
		Node fast = head;
		
		for(int i = 0; i < n; i++) {
			if(fast == null)
				return -1;
			fast = fast.next;
		}
		
		Node slow = head;
		
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		return slow.val;
	}

	public static Node reverseLLIterative(Node head) {
		Node curr = head;
		Node pre = null;
		while(curr != null) {
			Node next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		
		return pre;
	}
}


class Node {
	
	int val;
	Node next;
	
	public Node(int val) {
		this.val = val;
		this.next = null;
	}
}