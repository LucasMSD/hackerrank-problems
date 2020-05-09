import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        List<Integer> a = Stream.of(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> b = Stream.of(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result);
    }
    

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(Arrays.asList(0,0));

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) result.set(0, result.get(0) + 1);
            else if (a.get(i) < b.get(i)) result.set(1, result.get(1) + 1);
        }

        return result;
    }
}
