package Cursors;
import java.util.*;

class UserNoSuchElementException extends RuntimeException{
	public UserNoSuchElementException() {
		// TODO Auto-generated constructor stub
		super();
	}
}
interface UserEnumeration<E>{
	public abstract boolean hasMoreElements();
	public abstract E nextElement();
}
class MyVector<E>{
	private E[] arr;
	private int indx;
	public MyVector() {
		arr = (E[]) new Object[10];
	}
	public int size() {
		return indx;
	}
	public String toStrig() {
		if(size()==0) return "[]";
		
		String op = "[";
		for(int i = 0; i<size()-1;i++) {
			op+=arr[i]+" ,";
			
		}
		op+=arr[size()-1]+"]";
		return op;
	}
	public void add(E ele) {
		if(size()==arr.length) {
			E[] newArr = (E[]) new Object[size()*2];
			for(int i = 0;i<size();i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[indx++]=ele;
	}
	public UserEnumeration<E> elements(){
		UserEnumeration en = new UserEnumeration() {
			int indx = 0;
			@Override
			public boolean hasMoreElements() {
				if(indx<size()) return true;
				return false;
			}
			public E nextElement() {
				if(indx>=size())
					throw new UserNoSuchElementException();
				E temp = arr[indx];
				indx++;
				return temp;
			}
		};
		return en;
	}
}


public class DriverExampleVectorEnumeration {
	public static void main(String[] args) {
		MyVector<Integer> vector = new MyVector<Integer>();
		for(int i = 1; i<=10; i++) {
			vector.add(i);
		}
		System.out.println(vector);
		
		UserEnumeration<Integer> en = vector.elements();
		System.out.println(en);
		
		while(en.hasMoreElements()) {
			Integer ele = en.nextElement();
			System.out.println(ele);
			en.nextElement();
			en.nextElement();
		}
	}
}
