package ru.kolyanpie.easy.task290;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/description/
public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] wordArr = s.split(" ");
        if (pattern.length() != wordArr.length) {
            return false;
        }
        Map<Character, String> charWordMapping = new HashMap<>();
        Map<String, Character> wordCharMapping = new HashMap<>();

        for (int i = 0; i < wordArr.length; i++) {
            String wordFromMapping = charWordMapping.putIfAbsent(pattern.charAt(i), wordArr[i]);
            Character charFromMapping = wordCharMapping.putIfAbsent(wordArr[i], pattern.charAt(i));
            if (wordFromMapping == null || charFromMapping == null) {
                if (wordFromMapping == null && charFromMapping == null) {
                    continue;
                }
                return false;
            }
            if (!wordArr[i].equals(wordFromMapping)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
    }
}
