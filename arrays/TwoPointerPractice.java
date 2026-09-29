public class TwoPointerPractice {

    public static int[] squareAndSort(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int index = arr.length - 1; index >= 0; index--) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {-7, -3, 1, 4, 8};
        int[] result = squareAndSort(input);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
