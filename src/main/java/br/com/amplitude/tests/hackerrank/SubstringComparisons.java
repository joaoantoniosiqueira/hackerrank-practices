package br.com.amplitude.tests.hackerrank;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (i == 0) {
                smallest = substring;
                largest = substring;
            } else {
                if (smallest.compareTo(substring) > 0) smallest = substring;
                if (largest.compareTo(substring) < 0) largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        /*String helloWorld = "Helloworld";
        System.out.println(helloWorld.substring(7, 10));*/
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
