
import java.util.Scanner;

class Binary1 {

    static void binary() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;

        while (num > 0) {
            int rem = num % 2;
            binary = binary + rem * place;
            place = place * 10;
            num = num / 2;
        }

        System.out.println("Binary = " + binary);
    }

    public static void main(String[] args) {
        binary();      // method call
    }
}