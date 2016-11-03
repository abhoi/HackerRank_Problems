/*
    amlaanb
    https://github.com/amlaanb
    https://www.hackerrank.com/amlaanb
    03-NOV-2016
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        
        // declare sum variable = 0
        int sum = 0;
        
        // multi-dimensional matrix where i < j always true
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((a[i] + a[j]) % k == 0)
                    sum++;
            }
        }
        System.out.println(sum);
    }
}
