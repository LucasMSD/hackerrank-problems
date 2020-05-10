import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[scan.nextInt()];
        scan.nextLine();

        String[] arrItems = scan.nextLine().split(" ");

        for (int i = 0; i < arrItems.length; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }

        plusMinus(arr);

        scan.close();
    }


    static void plusMinus(int[] arr) {
        double[] result = {0, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) result[0] += Math.pow(arr.length, -1);
            else if (arr[i] < 0) result[1] += Math.pow(arr.length, - 1);
            else result[2] += Math.pow(arr.length, -1);
        }

        for (double value : result) {
            System.out.printf("%.6f\n", value);
        }
    }
}
