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

        // accept input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declare no. of initial users m = 5 and sum of liked users
        int m = 5;
        int sum = 0;

        // iterate over n days with floor(m/2)
        for (int i = 1; i <= n; i++) {
            sum += Math.floor(m / 2);
            m = (int) Math.floor(m / 2) * 3;
        }
        System.out.println(sum);
    }
}