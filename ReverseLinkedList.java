// Rearrange a linked list in such a way that all odd position nodes are together and all even 
// positions node are together, 
 
// Input:   1->2->3->4
// Output:  1->3->2->4

import java.util.*;

class Node {
int data;
Node next;
Node(int data) {
	this.data = data;
	this.next = null;
}
}

class LinkedList {
Node head;
LinkedList() { 
    this.head = null; 
}

Node newNode(int key) {
	Node temp = new Node(key);
	temp.next = null;
	return temp;
}

Node rearrangeEvenOdd(Node head) {
	if (head == null || head.next == null) {
	return null;
	}
	Node temp = head;
	Node oddStart = null;
	Node oddEnd = null;
	Node evenStart = null;
	Node evenEnd = null;
	int i = 1;
	while (temp != null) {
	if (i % 2 == 0) {
		if (evenStart == null) {
		evenStart = temp;
		}
		else {
		evenEnd.next = temp;
		}
		evenEnd = temp;
	}
	else {
		if (oddStart == null) {
		oddStart = temp;
		}
		else {
		oddEnd.next = temp;
		}
		oddEnd = temp;
	}
	temp = temp.next;
	i = i + 1;
	}
	oddEnd.next = evenStart;
	evenEnd.next = null;
	return oddStart;
}
void printlist(Node node) {
	while (node != null) {
	System.out.print(node.data + "->");
	node = node.next;
	}
	System.out.println("NULL");
}

void push(int new_data) {
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
}
}

class ReverseLinkedList {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.push(6);
	ll.push(5);
	ll.push(4);
	ll.push(3);
	ll.push(2);
	ll.push(1);
	System.out.println("Given Linked List");
	ll.printlist(ll.head);
	Node start = ll.rearrangeEvenOdd(ll.head);
	System.out.println("\nModified Linked List");
	ll.printlist(start);
}
}

// This code is contributed by Tapesh(tapeshdua420)
