import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        scan.nextLine();

        int[] arr = new int[length];

        String[] arrItems = scan.nextLine().split(" ");


        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }

        int[] res = reverseArray(arr);

        for (int value : res) {
            System.out.printf("%d ", value);
        }
    }

    /** Faz um for loop iterando pelo array passado como parâmetro e pelo novo array criado
     * dentro do método e atribuindo os valores para o novo com os índices invertidos.
     *
     * @param arr
     * @return Retora um novo array como os mesmo valores do array passado como parâmetro
     * porém como com seus índices invertidos
     */

    static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }

        return reversed;
    }
}
