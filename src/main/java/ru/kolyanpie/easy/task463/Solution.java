package ru.kolyanpie.easy.task463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int prevRowLandCount = 0;
        int perimeter = 0;
        for (int[] row : grid) {
            int currentRowLandCount = 0;
            int prevColLandCount = 0;
            for (int cell : row) {
                System.out.printf("cell=%d\n", cell);
                if (cell == 1) {
                    perimeter += 4 - prevColLandCount * 2;
                    currentRowLandCount++;
                    prevColLandCount = 1;
                } else {
                    prevColLandCount = 0;
                }
                System.out.printf("perimeter=%d\n", perimeter);
                System.out.printf("prevColLandCount=%d\n", prevColLandCount);
            }
            System.out.printf("prevRowLandCount=%d\n", prevRowLandCount);
            System.out.printf("currentRowLandCount=%d\n", currentRowLandCount);
            perimeter -= Math.min(prevRowLandCount, currentRowLandCount) * 2;
            System.out.printf("perimeter=%d\n", perimeter);
            prevRowLandCount = currentRowLandCount;
        }
        return perimeter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
        System.out.println(solution.islandPerimeter(new int[][]{{1, 1}}));
    }
}
