import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int ele = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ele) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}