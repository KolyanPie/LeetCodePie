package ru.kolyanpie.easy.task126;

import java.util.Arrays;

//https://leetcode.com/problems/valid-palindrome/solutions/3165353
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
