import java.util.Arrays;
class Sentinel{
	public static void main(String[] args){
		int [] arr = {1,2,5,4,66,3,5,66,77,33,};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter ele : " );
		int key = new java.util.Scanner(System.in).nextInt();
		//int indx = sentinalSearch(arr,key);
		//System.out.println(key+ " : " +(indx!= -1 ?indx : "not found "));
	}
	/*public static int sentinalSearch(int [] arr, int key){
		int n = arr.length;
		int temp = arr[n-1];
		arr[n-1] = key;
		int i = 0;
		while(arr[i]!=key){
			i++;
		}
		arr[n - 1] = temp;
		if(i<n-1 || arr[n-1] == key){
			return i ;
		}
		return -1;
	}*/
	public static int recursiveSearch(int[] arr, int key, int i) {
        if (i == arr.length)
            return -1;

        if (arr[i] == key)
            return i;

        return recursiveSearch(arr, key, i + 1);
    }
}