package br.com.amplitude.tests.hackerrank;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;

        String stringChecker = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            stringChecker = stringChecker.replaceFirst(Character.toString(a.charAt(i)).toLowerCase(), "");
        }
        return stringChecker.length() == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

