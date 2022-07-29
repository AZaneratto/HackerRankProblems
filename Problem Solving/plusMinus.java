import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double cont_pos = 0, cont_zero = 0, cont_neg = 0;
        double n = arr.size();
        String decimal = "%.6f%n";
        for (int element : arr) {
            if (element > 0) {
                cont_pos++;
                
            } else if (element == 0) {
                cont_zero++;
                
            } else {
                
                cont_neg++;
            }
        }
        
        System.out.printf(decimal, cont_pos/n);
        System.out.printf(decimal, cont_neg/n);
        System.out.printf(decimal, cont_zero/n);
        
    
        
            
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}