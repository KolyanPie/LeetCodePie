package ru.kolyanpie;

public class Yandex {
    public static boolean first(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());
        if (2 * maxLength - a.length() - b.length() > 1) {
            return false;
        }
        int minLength = Math.min(a.length(), b.length());
        int i = 0;
        while (i < minLength && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        int j = 1;
        while (i + j < minLength && a.charAt(a.length() - j) == b.charAt(b.length() - j)) {
            j++;
        }
        return i + j >= minLength;
    }

    public static int second(String t, String s) {
        for (int i = 0; i <= t.length() - s.length(); i++) {

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(first("a", "a"));
        System.out.println(first("a", "ab"));
        System.out.println(first("a", "abc"));
        System.out.println(first("aac", "abc"));
        System.out.println(first("ac", "abc"));
        System.out.println(first("acb", "abc"));
        System.out.println(first("acc", "abc"));
    }
}
