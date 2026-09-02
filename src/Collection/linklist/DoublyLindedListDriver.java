package Collection.linklist;

import java.util.*;
class UserNoSuchElementExceptoin extends RuntimeException{
	public UserNoSuchElementExceptoin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
class UserIndexOutOfBoundsException extends RuntimeException{
		public UserIndexOutOfBoundsException(String desc) {
			// TODO Auto-generated constructor stub
			super(desc);
		}
}
class DoublyLingedList<E>{
	protected Node<E> head;
	protected Node<E> tail;
	private int index;
	
	private class Node<E> {
		Node<E> prev;
		E ele;
		Node<E> next;
		
		Node(E ele){
			this.ele = ele;
		}
	}
	public int size() {
		return this.index ;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	@Override
	public String toString() {
		if(head == null) {
			return "[]";
		}
		String op = "[";
		Node<E> curr = head;
		while(curr.next!=null) {
			op+=curr.ele+" ,";
			curr = curr.next;
		}
		op+=curr.ele+"]";
		return op;
	}
	public void add(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if(head==null) {
			head = newNode;
			tail = head;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		this.index++;
	}
	public void addLast(E ele) {
		add(ele);
	}
	public void addFirst(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if(head == null) {
			head = newNode;
			tail = head;
		}else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		this.index++;
	}
	public E getFirst() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		return head.ele;
	}
	public E getLast() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		return tail.ele;
	}
	public E removeFirst() {
		if(isEmpty())
			throw new UserNoSuchElementExceptoin();
		E temp = head.ele;
		if(size()==1) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
			head.prev.next = null;
			head.prev = null;
		}
		this.index--;
		return temp;
	}
	public E removeLast() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		E temp = getLast();
		if(size()==1) {
	
			head = null;
			tail = null;
				
			}else {
				tail = tail.prev;
				tail.next.prev = null;
				tail.next = null;
			}
			this.index--;
			return temp;
			}		
			public void add(int indx, E ele) {
				if(indx<0 || indx>size())
					throw new UserIndexOutOfBoundsException
				  ("index " + indx + " out of bounds for size " + size());
				if(indx==0) {
					addFirst(ele);
					return;
				}
				if(indx == size()) {
					addLast(ele);
					return ;
				}	
				if(indx==size()) {
					addLast(ele);
					return;
		}
		Node<E> newNode = new Node<E>(ele);
		Node<E> curr1 = head;
		for(int i = 0 ; i<indx-1; i++) {
			curr1=curr1.next;
		}
//	Node<E> newNode = new Node<E>(ele);
		Node<E> curr2 = curr1.next;
		curr1.next = newNode;
		newNode.prev = curr1;
		newNode.next = curr2;
		curr2.prev = newNode;
		this.index++;
		
	}
	public E remove(int indx) {
		if(indx<0 || indx>=size())
			throw new UserIndexOutOfBoundsException
		("index "+indx+" out of bounds for size "+size());
		
		if(indx==size()-1) return removeLast();
		if(indx==0) return removeFirst();
		Node<E> curr1 = head;
		for(int i = 0 ; i<indx-1;i++) {
			curr1 = curr1.next;
		}
		Node<E> curr2 = curr1.next;
		
		curr1.next = curr2.next;
		curr2.next.prev = curr1;
		curr2.next = null;
		curr2.prev = null;
		this.index--;
		return curr2.ele;
	}
	public void clear() {
		while(!isEmpty())
			removeFirst();
	}
}

public class DoublyLindedListDriver {
	
	public static void main(String[] args) {
		DoublyLingedList<Integer> list1 = new DoublyLingedList<Integer>();
		System.out.println(list1);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println(list1);
		 
	}

}
