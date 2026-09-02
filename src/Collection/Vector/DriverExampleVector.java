package Collection.Vector;
import java.util.*;
class UserIndexOutOfBoundsException extends RuntimeException{
	UserIndexOutOfBoundsException(String desc){
		super (desc);
	}
}
class UserNoSuchElementException extends RuntimeException{
	UserNoSuchElementException() {
	super();
	}
}
class UserVector<E>{
	private E[] arr;
	private int index;
	private final int INITIAL_CAPACITY = 10;
	private int incrementalCapacity;
	private boolean flag;
	UserVector(){
		arr = (E[]) new Object[INITIAL_CAPACITY];
	}
	UserVector(int newCap) {
		arr = (E[]) new Object[newCap];
	}
	UserVector(int newCap , int incrementalCapacity) {
		arr = (E[]) new Object[newCap];
		this.incrementalCapacity = incrementalCapacity;
	}
	UserVector(UserVector oldVector){
		arr = (E[]) new Object[oldVector.size()];
		for(int i = 0 ; i<oldVector.size();i++) {
			arr[i] =(E)oldVector.elementAt(0);
		}
	}
	public void addElement(E ele) {
		if(this.size() == this.capacity()) {
			E[] newArr = (E[]) new Object[newCapacity()];
			for(int i = 0 ; i<this.arr.length ; i++)
				newArr[i] = this.arr[i];
				this.arr = newArr;

		}
		this.arr[this.index++]  = ele;
	}
	public E elementAt(int indx) {
		if(indx<0 || indx>=size()) throw new IndexOutOfBoundsException();
		
		return arr[indx];
	}
	public int newCapacity() {
		if(flag) return capacity()+incrementalCapacity;
		return capacity()*2;
	}
	public int size() {
		return index;
	}
	public int capacity() {
		return arr.length;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "[]";
		
		StringBuffer sb = new StringBuffer("[");
		for(int i =0 ; i<size() ;i++) {
			sb.append(arr[i]+",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		
		return sb.toString();
	}
	public int incrementalCapacity() {
		return newCapacity();
	}
	public E firstElement() {
		if(isEmpty()) throw new UserNoSuchElementException();
		
		return arr[0];
	}
	public E lastElement() {
		if(isEmpty()) throw new UserNoSuchElementException();
		
		return arr[size()-1];
	}
	public void removeElementAt(int indx) {
		if(indx<0  || indx>= size()) throw new IndexOutOfBoundsException();
		for(int i = indx ; i<size(); i++) {
			E temp = arr[indx];
			arr[i] = arr[i+1];
		}
		arr[size()-1] =null;
		index--;
	}
	public void removeAllElements() {
		for(int i = 0 ;i<size() ; i++) {
			arr[i] = null;
		}
		index = 0;
	}
	public void insertElementAt(int indx , E ele) {
		if(index < 0 || indx>size()) throw new IndexOutOfBoundsException();
		for(int i = size()-1 ; i>=indx ; i--) {
			arr[i+1] = arr[i];
		}
		arr[indx] = ele;
		index++;
	}
	public void trimToSize() {
		E [] newArr = (E[]) new Object[size()];
		for(int i = 0 ; i<size() ; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
		
	}
	public void setElementAt(int indx , E ele) {
		if(indx<0 || indx >= size()) throw new IndexOutOfBoundsException();
		arr[indx] = ele;
	}
	public void removeElement(E ele) {
		for(int i = 0 ; i<size(); i++) {
			if(arr[i]!=null && arr[i].equals(ele)) {
				removeElementAt(i);
				index--;
				return;
			}
		}
	}
	public void ensureCapacity(int minCap) {
		if(minCap>arr.length) {
			E[] newcapp = (E[]) new Object[minCap];
			for(int i = 0 ; i<size(); i++) {
				newcapp[i] = arr[i];
			}
			arr = newcapp;
		}
	}
	public boolean contains(E ele) {
		for(int i = 0 ; i<size() ; i++) {
			if(ele==null) {
				if(arr[i] == null) {
					return true;
				}
			}else {
				if(arr[i]!= null && arr[i].equals(ele)) {
					return true;
				}
			}
		}
		return false;
	}
	public int indexoF(E ele) {
		for(int i = 0; i<size() ; i++) {
			if(ele == null) {
				if(arr[i]== null) {
					return i;
				}
			}else {
				if(arr[i]!=null && arr[i].equals(ele)) {
					return i;
				}
			}
		}
		return -1;
	}
	public int lastindexof(E ele) {
		for(int i = size()-1; i>=0; i--) {
			if(ele == null) {
				if(arr[i]==null) {
					return i ;
				}
			}else {
				if(arr[i]!=null && arr[i].equals(ele)) {
					return i;
				}
			}
		}
		return -1;
	}
}

public class DriverExampleVector {

	public static void main(String[] args) {
		UserVector<Integer> list = new UserVector<Integer>(5);
		list.addElement(10);
		list.addElement(20);
		list.addElement(30);
		list.addElement(30);
		list.addElement(20);
		list.addElement(40);
		list.addElement(50);
		list.removeElementAt(0);
		System.out.println(list);
		System.out.println(list.lastindexof(20));
//		list.ensureCapacity(20);
//		System.out.println(list.capacity());
//		list.insertElementAt(2, 90);
//		list.trimToSize();
//		System.out.println(list);
//		list.setElementAt(3, 33);
//		list.removeElement(30);
		System.out.println(list);
	}
 
}

