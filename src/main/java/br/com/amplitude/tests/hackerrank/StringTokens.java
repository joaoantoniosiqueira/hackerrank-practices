package br.com.amplitude.tests.hackerrank;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.trim().split("[ !,?._'@]+");

        if (tokens.length == 1 && tokens[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.print(tokens.length);
        }
        for (String token : tokens) {
            System.out.print("\n" + token.trim());
        }

        scan.close();
    }
}

