package Cursors;
import java.util.*;
class UserIndexOutOfBoundsException extends RuntimeException{
		public UserIndexOutOfBoundsException() {
			// TODO Auto-generated constructor stub
			super();
		}
}
class UserNoSuchElementException extends RuntimeException{
	
			UserNoSuchElementException(){
			super();
		}
}
class UserIllegalStateExceptin extends RuntimeException{
	public UserIllegalStateExceptin() {
		// TODO Auto-generated constructor stub
		super();
	}
}
interface UserIerable<E>{
	UserIerable<E> iterator();
}
interface UserCollection<E> extends UserIerable<E>{
	
}
interface UserList<E> extends UserCollection<E>{
	
}
interface UserIterator<E>{
	public abstract boolean hasNext();
	public abstract E next();
	public abstract void remove();
}
interface UserListIterator<E> extends UserIterator<E>{
	public abstract boolean hasPrevious();
	public abstract E previous();
	public abstract int nextIndex();
	public abstract int previousIndex();
	public abstract void set(E ele);
	public abstract void add(E ele);
}
class UserArrayList<E> implements UserList<E>{
	private E[] arr;
	private int indx;
	
	public UserArrayList() {
		arr = (E[])  new Object[10];
	}
	public int size() {
		return indx;
	}
	public void add(E ele) {
		if(size()==arr.length) {
			E[] newArr = (E[]) new Object[(int)(size()*1.5)];
			for(int i = 0; i<size();i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[indx++] = ele;
	}
	public E remove(int index) {
		if(index<0 || index>=size()) throw new UserIndexOutOfBoundsException();
		
		E temp = arr[index];
		for(int i = index; i<size()-1;i++) {
			arr[i] = arr[i+1];
		}
		this.arr[size()-1] = null;
		indx--;
		return temp;
	}
	
	public String toString() {
		if(size()==0) return "[]";
		
		String op = "[";
		for(int i = 0; i<size()-1; i++) {
			op+=arr[i]+" ,";
		}
		op+=arr[size()-1]+"]";
		return op;
	}
	public void add(int index, E ele) {
		if(size()==arr.length) {
			E[] newArr = (E[])new Object[(int)(size()*1.5)];
			for(int i = 0; i<size(); i++) {
				newArr[i] = arr[i];
						
			}
			arr = newArr;
		}
		for(int i = size(); i>indx;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = ele;
		this.indx++;
	}
	public E set(int indx, E ele) {
		if(indx<0 || indx>=size()) 
			throw new UserIndexOutOfBoundsException();
		
		E temp = arr[indx];
		arr[indx] = ele;
		return temp;
	}
	public UserListIterator<E> listIterator1() {
	    return new ListItr<>(this);
	}
	public UserListIterator<E> listIterator(){
		return new ListItr(this);
	}
	class Itr<E> implements UserIterator<E>{
		UserArrayList list;
	    boolean flag;
	    int indx = 0;

	    Itr(UserArrayList ual){
	        this.list = ual;
	    }

	    public boolean hasNext() {
	        return indx < list.size();
	    }

	    public E next() {
	        if(!hasNext())
	            throw new UserNoSuchElementException();

	        flag = true;
	        return (E) list.arr[indx++];
	    }

	    public void remove() {
	        if(!flag)
	            throw new UserIllegalStateExceptin();

	        list.remove(--indx);
	        flag = false;
	    }
		
	}
//	public void removed() {
//		if(indx ==-1)
//			throw new UserIllegalStateExceptin();
//		
//		if(flag) 
//			list.remove(indx-1);
//		else list.remove(indx);
//	}
	class ListItr<E> extends Itr<E> implements UserListIterator<E>{
		boolean flag = true;
		
		ListItr(UserArrayList<E> list){
			super(list);
		}
		public int nextIndex() {
			return super.indx;
		}
		public void set(E ele) {
			list.set(nextIndex()-1, ele);
			
		}
		public boolean hasPrevious() {
			if(indx<0) indx=0;
			if(indx>0) return true;
			return false;
		}
		public E previous() {
			if(!hasPrevious()) throw new UserNoSuchElementException();
			
			E temp = (E)arr[--indx];
			return temp;
		}
		public int  previousIndex() {
			return indx-1;
			
		}
		public void add(E ele) {
			list.add(indx,ele);
			indx++;
		}
	}
	
}

public class DriverExampleIteratorListIterator {
	public static void main(String[] args) {
		UserArrayList<Integer> list = new UserArrayList<Integer>();
		for(int i = 10;i<=100;i+=10) {
			list.add(i);
		}
		System.out.println(list);
		
		UserListIterator<Integer> li = list.listIterator1();
		while(li.hasNext()) {
			Integer ele = li.next();
			System.out.println(li.nextIndex()+" : "+ele);
			if(li.nextIndex()==5) li.add(123123);
		}
		System.out.println("\n"+list);
		System.out.println("back traversing");
		while(li.hasPrevious()) {
			Integer ele = li.previous();
			System.out.println(li.previousIndex()+" : "+ele);
			
		}
		System.out.println("\n"+list);
	}
	
}
