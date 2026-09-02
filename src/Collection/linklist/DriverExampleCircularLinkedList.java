package Collection.linklist;

class UserNoSuchElementException extends RuntimeException{
	public UserNoSuchElementException() {
		// TODO Auto-generated constructor stub
		super();
	}	
}
class CircularLinkedList<E>{
	private Node<E> head;
	private Node<E> tail;
	private int index;
	
	private class Node<E>
	{
		E ele;
		Node<E> next;
		
		Node(E ele){
			this.ele = ele;
		}
	}
	
	@Override
	public String toString() {
		if(head == null) return "[]";
		
		Node<E> curr = head;
		StringBuffer op = new StringBuffer("[");
		while(curr.next!= head) {
			op.append(curr.ele+" ,");
			curr = curr.next;
			
		}
		op.append(curr.ele);
		op.append("]");
		
		return op.toString();
		
	}
	public void addLast(E ele) {
		add(ele);
	}
	public void add(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if(head == null) {
			head = newNode;
			tail = head;
			tail.next = head;
		}else {
			tail.next = newNode;
		}
		this.index++;
	}
	public void addFirst(E ele) {
		Node<E> newNode = new Node<E>(ele);
			if(head==null) {
				head = newNode;
				tail = head;
				tail.next = head;
			}else{
				newNode.next = head;
				head = newNode;
				tail.next = head;
			}
			this.index++;
	}
	public int size() {
		return this.index;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public E removeLast() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		Node<E> curr = head;
		for(int i = 0;i<size()-1; i++) {
			curr = curr.next;
		}
		E temp = tail.ele;
		curr.next = null;
		tail = curr;
		tail.next = head;
		this.index--;
		return temp;
	}
	public E removeFirst() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		E temp = head.ele;
		head = head.next;
		tail.next = head;
		this.index--;
		return temp;
	}
	
}
public class DriverExampleCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList<Integer> list1 = new CircularLinkedList();
		System.out.println(list1);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println(list1);
	
	}
}
