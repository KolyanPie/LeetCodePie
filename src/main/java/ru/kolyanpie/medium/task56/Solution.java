package ru.kolyanpie.medium.task56;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/merge-intervals/description/
public class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            mergeIntoResult(intervals[i], result);
//            if (intervals[i][1] >= newInterval[0]) {
//                if (intervals[i][0] > newInterval[1]) {
//                    int[][] result = new int[intervals.length + 1][2];
//                    System.arraycopy(intervals, 0, result, 0, i);
//                    result[i] = newInterval;
//                    System.arraycopy(intervals, i, result, i + 1, intervals.length - i);
//                    return result;
//                }
//                if (intervals[i][0] == newInterval[1]) {
//                    int[][] result = new int[intervals.length][2];
//                    System.arraycopy(intervals, 0, result, 0, i);
//                    newInterval[1] = intervals[i][1];
//                    result[i] = newInterval;
//                    System.arraycopy(intervals, i + 1, result, i + 1, intervals.length - i - 1);
//                    return result;
//                }
                for (int j = i; j < intervals.length; j++) {
                    System.out.println(Arrays.toString(intervals[j]));
//                    if (intervals[j][0])
                }

//            }
        }
//        int[][] result = new int[intervals.length + 1][2];
//        System.arraycopy(intervals, 0, result, 0, intervals.length);
//        result[intervals.length] = newInterval;
//        return result;
        return null;
    }

    private void mergeIntoResult(int[] newInterval, ArrayList<int[]> result) {
        int startIndex = -1;
        int cursor = result.size() / 2;
        int step = result.size();
        while (true) {
//            if ()
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.merge(new int[][]{{1, 3}, {6, 9}})));
        System.out.println(Arrays.deepToString(solution.merge(new int[][]{{1, 3}, {2, 9}})));
    }
}
