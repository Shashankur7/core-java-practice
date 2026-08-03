/*import java.util.Scanner;
import java.util.Arrays;
class Demo21Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<arr.length; i++){
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		System.out.println(Arrays.toString(arr));
		isPrime(arr);
	}
	static void isPrime(int [] arr){
		int newArr[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++){
			int cnt = 0;
			int j = 1;
			while(j<=arr[i]){
				if(arr[i]%j==0){
				++;
				}
				j++;
			}
			if(cnt ==2){
				newArr[i] = arr[i];
			}
			else {
				continue;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}*/



import java.util.Arrays;

class Demo21Prime {
    public static void main(String[] args) {

        int[] arr = new int[10];

        int count = 0;
        int num = 2;

        while (count < arr.length) {

            int cnt = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                arr[count] = num;
                count++;
            }

            num++;
        }

        System.out.println(Arrays.toString(arr));
    }
}


































