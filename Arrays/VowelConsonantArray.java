import java.util.Arrays;

class VowelConsonantArray  {
    public static void main(String[] args) {

        String str = "education";

        // Convert String to char array
        char[] arr = str.toCharArray();

        int vowelCount = 0;
        int consonantCount = 0;

        // Count vowels and consonants
        for (int i = 0; i < arr.length; i++) {

            char ch = Character.toLowerCase(arr[i]);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {

                    vowelCount++;

                } else {

                    consonantCount++;
                }
            }
        }

        char[] vowels = new char[vowelCount];
        char[] consonants = new char[consonantCount];

        int v = 0;
        int c = 0;

        // Store vowels and consonants
        for (int i = 0; i < arr.length; i++) {

            char ch = Character.toLowerCase(arr[i]);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {

                    vowels[v++] = arr[i];

                } else {

                    consonants[c++] = arr[i];
                }
            }
        }

        System.out.println("Vowels     : " + Arrays.toString(vowels));
        System.out.println("Consonants : " + Arrays.toString(consonants));
    }
}