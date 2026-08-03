import java.util.Arrays;
class RemoveElement{
	public static void main(String[] args){
		int [] arr = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		removeElement(3 , arr);

	}
	public static void removeElement(int indx , int [] arr){
		if(indx<0 || indx>arr.length)
			throw new ArrayIndexOutOfBoundsException("invalid index");
		int [] newArr = new int[arr.length-1];
		for(int i = 0; i<arr.length ; i++){
			
			if(i<indx){
				newArr[i] = arr[i];
			}else if (i>indx){
				newArr[i-1] = arr[i];
			}
		}
		System.out.println(Arrays.toString(newArr));
	
}
}