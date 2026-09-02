package Collection.linklist;

import java.util.*;
class UserNoSuchElementException extends RuntimeException{
	public UserNoSuchElementException() {
		// TODO Auto-generated constructor stub
		super();
	}
}
interface UserList<E>{
	void add(E ele);
	boolean remove(E ele);
	int size();
	E getLast();
}
class UserLinkedList<E> implements UserList<E>
{
	private int index;
	protected Node<E> head;
	protected Node<E> tail;
	
	public class Node<E>{
		E ele; //10
		Node<E> next; //null
		
		Node(E ele){
			this.ele = ele;
		}
	}
	
	public void add(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if(head==null) {
			head = newNode;
			tail = head;
		}else {
			tail.next = newNode;
			tail= newNode; // tail updation
			
		}
		this.index++;
	}
	public boolean offer(E ele) {
		add(ele);
		return true;
	}
	
	public int size() {
		return this.index;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "[]";
		
		String str ="[";
		Node<E> currNode = head;
		for(int i = 0;i<size()-1;i++) {
			str+= currNode.ele+" , ";
			currNode = currNode.next;
		}
		return str+=currNode.ele+"]";
	}
	public E getFirst() {
		return this.head.ele;
	}
	public E getLast() {
		return this.tail.ele;
	}
	public E peekFirst() {
		return getFirst();
	}
	public E peekLast() {
		return getLast();
	}
	public void addFirst(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if(head==null) {
			head = newNode;
			tail = head;
		}else {
			newNode.next = head;
			head = newNode;
		}
		this.index++;
	}
	public boolean offerFirst(E ele) {
		addFirst(ele);
		return true;
	}
	public void addLast(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if(head==null) {
			head = newNode;
			tail = head;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		this.index++;
	}
	public boolean offerLast(E ele) {
		addLast(ele);
		return true;
	}
	public E removeFirst() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		Node<E> tempNode = head;
		head = head.next;
		tempNode.next = null;
		this.index--;
		return tempNode.ele;
	}
	public E pollfirst() {
		return removeFirst();
	}
	public E remove() {
		return removeLast();
	}
	public E pollLast() {
		return removeLast();
	}
	public E removeLast() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		Node<E> currNode = head;
		for(int i = 0; i<size()-1 ; i++) {
			currNode = currNode.next;
		}
			E temp = getLast();
			currNode.next = null;
			this.index--;
			tail = currNode;
			return temp;
		}
		public boolean contains(E ele) {
			if(isEmpty())
				return false;
			
			Node<E> currNode = head ;
			while(currNode.next!=null) {
				if(currNode.ele.equals(ele)) return true;
				currNode = currNode.next;
			}
			return false;
	}
	public E remove(int indx) {
		if(indx<0 || indx>=size())
			throw new IndexOutOfBoundsException();
			
		if(indx==0) {
			return removeFirst();
		}
		if(indx==size()-1) {
			return removeLast();
		}
		
		Node<E> curr1 = head;
		Node<E> curr2 = null;
		for(int i = 0;i<indx; i++) {
			curr2 = curr1;
			curr1 = curr1.next;
		}
		curr2.next = curr1.next;
		curr1.next = null;
		this.index--;
		return curr1.ele;
	}
	
	public boolean remove(E ele) {
		if(ele.equals(getFirst())) {
			removeFirst();
			return true;
		}
		if(ele.equals(getLast())) {
			removeLast();
			return true;
		}
		
		Node<E> curr1 = head;
		Node<E> curr2 = null;
		while(curr1.next!=null) {
			if(curr1.ele.equals(ele)) break;
			curr2 = curr1;
			curr1 = curr1.next;
		}
		if(curr1.next==null) return false;
		curr2.next = curr1.next;
		curr1.next =null;
		this.index--;
		return true;
	}
	
	public void clear() {
		if(isEmpty()) return;
		int len = size();
		for(int i = 0; i<len; i++) {
			removeFirst();
		}
	}
	public E get(int indx) {
		if(indx<0 || indx>=size())
			throw new IndexOutOfBoundsException
				    ("index " + indx + " out of bounds for size " + size());
		
		Node<E> curr = head;
		for(int i = 0 ;i<indx ; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	public void checkIndex(int indx) {
		if(indx<0 || indx>=size())
			throw new IndexOutOfBoundsException
				    ("index " + indx + " out of bounds for size " + size());
	}
	public E set(int indx, E newEle) {
		checkIndex(indx);
		
		Node<E> curr = head;
		for(int i = 0; i<indx ; i++) {
			curr = curr.next;
		}
		E temp = curr.ele;
		curr.ele = newEle;
		return temp;
	}
	public void add(int indx, E ele) {
		if(indx != size())checkIndex(indx);
		
		if(indx ==0) {
			addFirst(ele);
			return ;
		}
		if(indx==size()-1) {
			addLast(ele);
			return;
		}
		
		Node<E> newNode = new Node<E>(ele);
		
		Node<E> currNode1 = head;
		for(int i = 0; i<indx-1 ; i++) {
			currNode1 = currNode1.next;
		}
		Node<E> currNode2 = currNode1.next;
		currNode1.next = newNode;
		newNode.next = currNode2;
		this.index++;
	}
	
	public UserLinkedList<E>.Node<E> node(int indx){
		checkIndex(indx);
		Node<E> curr = head;
		for(int i = 0 ;i<indx;i++) {
			curr = curr.next;
		}
		return curr;
	}
	public int indexOf(E ele) {
		if(isEmpty()) return -1;
		
		Node<E> curr = head;
		int i = 0;
		while(curr.next!=null){
			if(curr.ele.equals(ele)) return i;
			curr = curr.next;
			i++;
		}
		return -1;
	}
	public int lastIndexOf(E ele) {
		if(isEmpty()) return -1;
		
		Node<E> curr = head;
		int i = 0;
		int op = -1;
		while(curr.next!=null) {
			if(curr.ele.equals(ele)) op = i;
			curr = curr.next;
			i++;
		}
		return op;
	}
	public E peak() {
		return peekLast();
	}
	public boolean removeFirstOccurrence(E ele) {
		if(isEmpty()) return false;
		int indx = indexOf(ele);
		if(indx!=-1) {
			remove(indx);
			return true;
		}
		return false;
	}
	public boolean  removeLastOccurrence(E ele) {
		if(isEmpty()) return false;
		int indx = lastIndexOf(ele);
		if(indx!=-1) {
			remove(indx);
			return true;
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public Object[] toArray() {
		if(size()==0) return new Object[0];
		
		Object[] arr = new Object[size()];
		for(int i = 0; i<size() ; i++) {
			arr[i] = this.get(i);
		}
		return arr;
	}
	public <T> T[] toArray(T[] arr1) {
		if(size()==0) return arr1;
		
		for(int i = 0 ; i<size(); i++) {
			arr1[i] = (T)this.get(i);
		}
		return arr1;
	}
	public UserLinkedList<E> reversed(){
		UserLinkedList<E> newList = new UserLinkedList<E>();
		for(int i = this.size()-1; i>=0; i--) {
			newList.addLast(this.get(i));
		}
		return newList;
	}
	public void addAll(UserLinkedList<E> colln) {
		for(int i = 0 ; i<colln.size(); i++) {
			this.addLast((E)(colln.get(i)));
			
		}
	}
	public void removeAll(UserLinkedList<E> colln) {
		for(int i = 0; i<colln.size(); i++) {
			E temp = colln.get(i);
			
			while(true) {
				int indx = this.indexOf(temp);
				if(indx != -1) this.remove(indx);
				else break;
			}
			if(colln.get(colln.size()-1).equals(this.get(this.size()-1)));
		}
	}
	public void addAll(int indx, UserLinkedList<E> colln) {
		if(isEmpty() || indx== this.size()) addAll(colln);
		
		for(int i = 0; i<colln.size(); i++) {
			E ele = colln.get(i);
			this.add(indx++,ele);
		}
	}
}

public class DriverExampleLinklist {
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);
//		list1.remove(10);
		System.out.println(list1);
		
		System.out.println("___________________");
		UserLinkedList<Integer> list2 = new UserLinkedList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		System.out.println(list2);
//		list2.remove(10);
		System.out.println(list2.offerFirst(8983749));
		System.out.println(list2);
		System.out.println(list2.size());
	}
}
