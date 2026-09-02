package Collection.CollectionArrayList;
import java.util.ArrayList;
class UserNoSuchElementException extends RuntimeException{
		public UserNoSuchElementException() {
			super();
			
		}
}
class UserIndexOutOfBoundsException extends RuntimeException{
	public UserIndexOutOfBoundsException(String desc) {
		super(desc);
		// TODO Auto-generated constructor stub
	}
}
class MyArrayList<E> {

	private E[] arr;
	private int indx;
	private final int INITIAL_CAPACITY = 10;
	
	public MyArrayList()
	{
		this.arr= (E[]) new Object[INITIAL_CAPACITY];
	}
	public MyArrayList(int newCap) {
		this.arr = (E[])new Object[newCap];
	}
	public MyArrayList(MyArrayList colln) {
		this.arr = (E[])new Object[colln.size()];
		
		for(int i = 0;i<this.arr.length;i++) {
			this.arr[i] = (E)colln.get(i);
		}
	}
	public int size() {
		return this.indx;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	@Override
	public String toString() {
		if(size()==0) return "[]";
		StringBuffer sb = new StringBuffer("[");
		
		for(int i = 0; i<size() ; i++) {
			sb.append(this.arr[i]+" , ");
		}
		sb.append(this.arr[size()-1]+"]");
		
		return sb.toString();
		
	}
	
	private int newCapacity(int oldCap) {
		return (int)(oldCap*1.5);
	}
	
	public void addLast(E ele) {
		add(ele);
	}
	public boolean add(E ele)
	{
		if(size()==this.arr.length) {
			//new arr
			this.arr= createNewArray(this.arr.length);
			}
		
		this.arr[this.indx]= ele;
		this.indx++;
		
		return true;
	}
	
	public void addFirst(E ele) {
		
		if(size()==this.arr.length) {
			// newArr
			this.arr = createNewArray(this.arr.length);
			}
		
		for(int i = size()-1 ; i>=0 ; i--) {
			this.arr[i+1] = this.arr[i];
		}
		
		this.arr[0] = ele;
		this.indx++;
	}
	public void add(int index , E ele) {
		checkIndex(index);
		
		if(this.size()==this.arr.length) {
			// new arr
			this.arr = createNewArray(this.arr.length);
		}
		
		for(int i = this.size()-1;i>=index;i--) {
			this.arr[i+1] = this.arr[i];
		}
		this.arr[index] = ele;
			this.indx++;
	}
	
	public boolean contains(E ele) {
		if(size()==0) return false;
		
		for(int i = 0; i<size(); i++) {
			if(this.arr[i].equals(ele)) return true;
		}
		return false;
	}
	
	public int capacity() {
		return this.arr.length;
	}
	
	public E get(int index)
	{
		checkIndex(index);
		return this.arr[index];
	}
	
	public E removeFirst() {
		if(isEmpty())
			throw new UserNoSuchElementException();
		
		E temp = this.arr[0];
		for(int i = 1; i<size(); i++) {
			this.arr[i-1] = this.arr[i];
		}
		this.indx--;
		return temp;
	}
	public E removeLast() {
		if(size()==0)
			throw new UserNoSuchElementException();
		
		E temp = this.arr[this.size()-1];
		this.arr[size()-1] = null;
		this.indx--;
		return temp;
		
	}
	
	public E getFirst() {
		return get(0);
	}
	public E getLast() {
		return get(this.size()-1);
	}
	public void checkIndex(int index) {
		if(index<0 || index>=size())
			throw new UserIndexOutOfBoundsException
			("Index "+index+"out of bounds for length "+size());
	}
	
	public E[] createNewArray(int oldLen) {
		E[] newArr = (E[]) new Object[newCapacity(oldLen)];
		
		for(int i = 0; i<size(); i++) {
			newArr[i] = this.arr[i];
		}
		return newArr;
	}
	public void trimToSize() {
		if(this.arr.length==this.size()) return ;
		
		E[] newArr = (E[]) (new Object[this.size()]);
		for(int i = 0 ;i<size(); i++) {
			newArr[i] = this.arr[i];
		}
		this.arr= newArr;
	}
	
	public void ensureCapacity(int newCap) {
		if(this.capacity()>=newCap) return;
		
		E[] newArr = (E[]) new Object[newCap];
		for(int i= 0; i<this.size() ;i++) {
			newArr[i] = this.arr[i];
		}
		this.arr = newArr;
	}
	public int indexOf(E ele) {
		if(isEmpty()) return -1;
		
		for(int i = 0; i<this.size(); i++) {
			if(ele.equals(this.arr[i])) return i;
		}
		return -1;
	}
	public int lastIndexOf(E ele) {
		if(isEmpty()) return -1;
		
		for(int i = this.size()-1 ; i>=0;i--) {
			if(ele.equals(this.arr[i])) return i;
		}
		return -1;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public Object [] toArray() {
		
		Object[] newArr = new Object[this.size()];
		for(int i = 0; i<this.size(); i++) {
			newArr[i] = this.arr[i];
		}
		
		return newArr;
	}
	
	public <T> T[] toArray(T[] newArr) {
		
		T[] newArr1 = (T[])new Object[newArr.length];
		for(int i = 0 ;i<this.size();i++) {
			newArr1[i] = (T)this.arr[i];
		}
		return newArr1;
		
	}
	public E set(int index , E newEle) {
		checkIndex(index);
		E temp = this.arr[index];
		this.arr[index] = newEle;
		return temp;
		
	}
	
	public E remove(int index) {
		checkIndex(index);
		
		E temp = this.arr[index];
		for(int i = index+1;i<size() ; i++) {
			this.arr[i-1] = this.arr[i];
		}
		this.indx--;
		return temp;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(this instanceof MyArrayList)) return false;
		return this.hashCode() == obj.hashCode();
	}
	public boolean remove(Object ele) {
		E themp = (E)ele;
		int indx = this.indexOf(themp);
		if(indx!= -1) {
			remove(indx);
			return true;
		}
		return false;
	}
	public void clear() {
		if(isEmpty()) return ;
		
		for(int i =0 ; i<size() ; i++) {
			this.arr[i] = null;
		}
		this.indx = 0;
	}

}
class DriverExample2{
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		System.out.println(list1);
		MyArrayList<Integer> list2 = new MyArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		System.out.println(list2);
		list2.clear();
		System.out.println(list2.size());
		System.out.println(list2.get(0));
//		System.out.println(list2.get(0));
//		System.out.println(list2.get(5));
		//System.out.println(list2.get(6));
	}
}