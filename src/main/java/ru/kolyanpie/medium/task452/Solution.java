package ru.kolyanpie.medium.task452;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=daily-question&envId=2024-03-20
public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int arrows = 0;
        for (int i = 0; i < points.length; i++) {
            int target = points[i][1];
            while (i + 1 < points.length && points[i + 1][0] <= target) {
                i++;
            }
            arrows++;
        }
        return arrows;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
        System.out.println(solution.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
    }
}
