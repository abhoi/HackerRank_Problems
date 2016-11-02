/*
    amlaanb
    https://github.com/amlaanb
    https://www.hackerrank.com/amlaanb
    02-NOV-2016
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        // sum and temp variable declaration
        int apple_sum = 0;
        int orange_sum = 0;
        int temp = 0;

        // iterate apple distances, calculate distances, compare with ranges
        for (int a_i = 0; a_i < m; a_i++) {
            temp = a + apple[a_i];
            if (temp >= s && temp <= t)
                apple_sum++;
        }

        // iterate orange distances, calculate distances, compare with ranges        
        for (int o_i = 0; o_i < n; o_i++) {
            temp = b + orange[o_i];
            if (temp >= s && temp <= t)
                orange_sum++;
        }
        
        // print respective sums
        System.out.println(apple_sum);
        System.out.println(orange_sum);
        
    }
}
