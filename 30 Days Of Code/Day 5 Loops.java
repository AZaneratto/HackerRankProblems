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



public class Solution {
    
    static void solve(int n) {
        int i = 1;
        while(i<=10) {
            int multiply = i*n;
            System.out.println(n + " x " + i +" = " + multiply);
            i++;
        }
        
        
    }
    
    
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        solve(n);
        bufferedReader.close();
    }
}
