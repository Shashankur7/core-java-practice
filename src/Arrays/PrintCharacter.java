package Arrays;


import java.util.Scanner;

class PrintCharacter {

    public static void main(String[] args) {
        System.out.println("Enter String : ");

        String res = new Scanner(System.in).nextLine();

        character(res);
    }

    public static void character(String res) {
        for (int i = 0; i < res.length(); i++) {
            System.out.println(res.charAt(i));
        }
    }
}
