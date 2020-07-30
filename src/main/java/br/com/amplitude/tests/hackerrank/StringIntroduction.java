package br.com.amplitude.tests.hackerrank;

import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(lengthSum(A, B));
        System.out.println(compareLexicography(A, B));
        System.out.println(capitalize(A) + " " + capitalize(B));
    }

    private static int lengthSum(String str1, String str2) {
        return str1.length() + str2.length();
    }

    private static String compareLexicography(String str1, String str2) {
        return str1.compareTo(str2) > 0 ? "Yes" : "No";
    }

    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
