/*import java.util.Arrays;
class PracticMerge{
	public static void main(String[] args){
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,8,9,0};
		int [] c = new int[a.length + b.length];
		
		for(int i = 0; i<c.length; i++){
			if(i<a.length){
				c[i] = a[i];
			}else{
				c[i] = b[i - a.length];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}*/

/*
import java.util.Arrays;
class PracticeMerge{
	public static void main(String[] args){
		int [] a= {1,2,3,4};
		int [] b = {5,6,7,8,9};
		int [] c =new int [a.length + b.length];
		int  max = a.length > b.length ? a.length : b.length;
		
		for(int i = 0 ,j = 0 ; i<max ; i++){
			if(i<a.length)c[j++] = a[i];
			if(i<b.length)c[j++] = b[i];
		}	
		System.out.println(Arrays.toString(c));
	}
}*/

/*import java.util.Arrays;
class PracticeExample{
	public static void main(String[] args){
		int [] a = {1,2,3,4};
		int [] b = {5,6,7,8};
		int [] c = new int [a.length + b.length];
	
		for(int i = 0 ; i<c.length ; i++){
		if(i<a.length){
			c[i] = a[i];
		}else{
			c[i] = b[i - a.length];
		}
	}
		System.out.println(Arrays.toString(c));
	}
}*/

import java.util.Arrays;
class PracticeExample{
	public static void main(String [] args){
		int [] a ={1,2,3};
		int [] b ={4,5,6,7,8,9};
		int [] c =new int [a.length + b.length];
		int max = a.length> b.length? a.length : b.length;
	
		for(int i = 0 , j = 0; i<max ; i++){
			if(i<a.length)c[j++] = a[i];
			if(i<b.length)c[j++] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}
}






















































































			