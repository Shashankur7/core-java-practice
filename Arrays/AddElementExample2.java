import java.util.Arrays;
class AddElementExample2{
	public static void main(String[] args){
		int [] arr = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(arr));
		addElement(3,70,arr);

	}
	public static void addElement(int indx, int newElem, int[] arr){
		int [] newArr = new int[arr.length+1];
		for(int i = 0; i<newArr.length; i++){
			if(i<indx){
				newArr[i] = arr[i];
			}else if(i == indx){
				newArr[i] = newElem;
			}else{
				newArr[i] = arr[i - 1];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}