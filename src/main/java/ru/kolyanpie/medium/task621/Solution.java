package ru.kolyanpie.medium.task621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/task-scheduler/submissions/?envType=daily-question&envId=2024-03-20
public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] countsArr = new int[26];
        for (char task : tasks) {
            countsArr[(int) task - 65]++;
        }
        List<Integer> counts = new ArrayList<>(Arrays.stream(countsArr).filter(a -> a > 0).sorted().boxed().toList());
        Collections.reverse(counts);
        int iterations = 0;
        while (counts.get(0) > 0) {
            if (counts.get(0) == 1) {
                return iterations + (int) counts.stream().filter(a -> a > 0).count();
            }
            int i = n + 1;
            for (int j = 0; j < counts.size() && i > 0 && counts.get(j) > 0; j++, i--) {
                counts.set(j, counts.get(j) - 1);
            }
            iterations += n + 1;
            Collections.sort(counts);
            Collections.reverse(counts);
        }
        return iterations;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.leastInterval(new char[]{'A', 'C'}, 2));
//        System.out.println(solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
//        System.out.println(solution.leastInterval(new char[]{'A', 'C', 'A', 'B', 'D', 'B'}, 1));
//        System.out.println(solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 3));
    }
}
