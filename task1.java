package org.example.hw01;

import java.util.Scanner;

/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words.
Do not include any extra spaces.
Input: s = "  hello world  "
Output: "world hello"
 */

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String s = in.nextLine();
        System.out.printf("string: %s", s);
        in.close();
    }
    public static String reverseString(String s) {
        char[] array = s.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }
}