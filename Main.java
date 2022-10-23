package com.acos;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String s1 = "abba";
        String s2 = "aabb";

        if (fun2(s1, s2)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    // The idea is, we will sort the two strings and then check whether they are equal or not
    public static boolean fun1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // We will make a character array, and then we will sort the array and change our s1 to that modified string.

        // Sorting the first string
        char []a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        // Sorting the second string
        char []a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }

    public static boolean fun2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int []count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
