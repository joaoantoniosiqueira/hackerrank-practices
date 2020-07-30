package br.com.amplitude.tests.hackerrank;

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = A.length() - 1; i >= 0; i--) {
            stringBuilder.append(A.charAt(i));
        }

        if (stringBuilder.toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

