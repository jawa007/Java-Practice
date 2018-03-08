package com.core.java.datastructure;

public class StackUsingArray<E> {

	int size;
	int capacity;
	int top = -1;
	E arr[];

	@SuppressWarnings("unchecked")
	StackUsingArray(int capacity) {
		this.capacity = capacity;
		this.arr = (E[]) new Object[capacity];
	}

	public boolean push(E e) {
		if (size == capacity) {
			return false;
		} else {
			arr[++top] = e;
			size++;
		}
		return false;
	}

	public E pop() {
		E result = null;
		if (size <= 0) {
			return null;
		} else {
			result = arr[top];
			arr[top] = null;
			size--;
		}
		return result;
	}
	
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
	
	public static void main(String[] args) {
		StackUsingArray<String> stack = new StackUsingArray<String>(11);
		stack.push("hello");
		stack.push("world");
 
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
	}

}
