import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        scan.nextLine();

        long[] ar = new long[length];

        String[] elements = scan.nextLine().split(" ");

        for (int i = 0; i < elements.length; i++) {
            ar[i] = Integer.parseInt(elements[i]);
        }

        long result = aVeryBigSum(ar);

        System.out.println(result);

        scan.close();
    }


    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).reduce(0, (x, y) -> x+y);
    }
}
