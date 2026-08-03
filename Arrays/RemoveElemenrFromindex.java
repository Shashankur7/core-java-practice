import java.util.Arrays;
class RemoveElemenrFromindex{
	public static void main(String[] args){
		
		
        int[] arr = {10, 20, 30, 40, 50};
	System.out.println(Arrays.toString(arr));

        int index = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {

            if (i < index) {
                newArr[i] = arr[i];
            } else if (i > index) {
                newArr[i - 1] = arr[i];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}