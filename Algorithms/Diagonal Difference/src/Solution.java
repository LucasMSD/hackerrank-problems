import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<List<Integer>> matrix = new ArrayList<>();

        int order = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < order; i++) {
            matrix
                    .add (
                            Arrays.stream(scan.nextLine().split(" "))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList())
                    );
        }


        int result = diagonalDifference(matrix);

        System.out.println(result);

        scan.close();
    }


    /**
     * Subtrai a soma dos elementos da diagonal principal de uma matriz quadrada da outra diagonal
     *
     * [a, b, c, d]
     * [e, f, g, h]
     * [i, j, k, l]
     * [m, n, o, p]
     *
     * (a + f + k + p) - (d + g + j + m) =>
     * (a - d) + (f - g) + (k - j) + (p - m)
     *
     * Subtraindo direto os valores de cada diagonal em cada linha
     *
     *
     * @param matrix
     * @return
     */
    static int diagonalDifference(List<List<Integer>> matrix) {
        int result = 0;
        int size = matrix.size();
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            result += matrix.get(i).get(i) - matrix.get(i).get(j);
        }

        return Math.abs(result);
    }
}