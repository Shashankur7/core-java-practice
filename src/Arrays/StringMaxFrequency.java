package Arrays;
import java.util.Arrays;

class StringMaxFrequency {
    public static void main(String[] args) {

        String[] arr = {
            "java","sql","java","python",
            "sql","java","c","python",
            "sql","html","java"
        };

        System.out.println(Arrays.toString(arr));

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        String ele1 = "";
        String ele2 = "";
        String ele3 = "";

        boolean[] b = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {

            if(b[i])
                continue;

            int cnt = 0;

            for(int j = 0; j < arr.length; j++) {

                if(arr[i].equals(arr[j]) && !b[j]) {
                    cnt++;
                    b[j] = true;
                }
            }

            if(cnt > max1) {

                max3 = max2;
                ele3 = ele2;

                max2 = max1;
                ele2 = ele1;

                max1 = cnt;
                ele1 = arr[i];

            }
            else if(cnt > max2) {

                max3 = max2;
                ele3 = ele2;

                max2 = cnt;
                ele2 = arr[i];

            }
            else if(cnt > max3) {

                max3 = cnt;
                ele3 = arr[i];
            }
        }

        System.out.println("1st Highest : " + ele1 + " : " + max1);
        System.out.println("2nd Highest : " + ele2 + " : " + max2);
        System.out.println("3rd Highest : " + ele3 + " : " + max3);
    }
}