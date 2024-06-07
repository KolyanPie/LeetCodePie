package ru.kolyanpie.medium.task57;

import java.util.Arrays;

//https://leetcode.com/problems/insert-interval/description/?envType=daily-question&envId=2024-03-20
public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] >= newInterval[0]) {
                if (intervals[i][0] > newInterval[1]) {
                    int[][] result = new int[intervals.length + 1][2];
                    System.arraycopy(intervals, 0, result, 0, i);
                    result[i] = newInterval;
                    System.arraycopy(intervals, i, result, i + 1, intervals.length - i);
                    return result;
                }
                if (intervals[i][0] == newInterval[1]) {
                    int[][] result = new int[intervals.length][2];
                    System.arraycopy(intervals, 0, result, 0, i);
                    newInterval[1] = intervals[i][1];
                    result[i] = newInterval;
                    System.arraycopy(intervals, i + 1, result, i + 1, intervals.length - i - 1);
                    return result;
                }
                for (int j = i; j < intervals.length; j++) {
                    System.out.println(Arrays.toString(intervals[j]));
//                    if (intervals[j][0])
                }
            }
        }
        int[][] result = new int[intervals.length + 1][2];
        System.arraycopy(intervals, 0, result, 0, intervals.length);
        result[intervals.length] = newInterval;
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{4, 5})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{4, 6})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{3, 6})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{3, 5})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 6})));
        System.out.println(Arrays.deepToString(solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
    }
}
