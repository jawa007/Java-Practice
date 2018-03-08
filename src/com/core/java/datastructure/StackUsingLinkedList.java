package com.core.java.datastructure;

class Node {
	int data;
	Node next;

	Node(int key) {
		data = key;
		next = null;
	}
}

class linkedList {
	Node fisrt;

	linkedList() {
		fisrt = null;
	}

	public void insert(int i) {
		Node item = new Node(i);
		item.next = fisrt;
		fisrt = item;
	}

	public Node delete() {
		Node temp;
		temp = fisrt;
		fisrt = fisrt.next;
		return temp;
	}

}

public class StackUsingLinkedList {

	public boolean push(int i) {
		linkedList list = new linkedList();
		list.insert(i);
		return true;
	}

	public Node pop() {
		linkedList list = new linkedList();
		return list.delete();
	}
}
