package ru.kolyanpie.medium.task442;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/?envType=daily-question&envId=2024-03-25
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            setIdentifyForCycle(nums, resultList, i);
        }
        //попробовать по циклу (по значениям пивотиться на индексы) заменять на нули, а потом пройтись ещё раз по массиву
        return resultList;
    }

    private void setIdentifyForCycle(int[] nums, List<Integer> resultList, int index) {
        if (nums[index] == index + 1) {
            return;
        }
        int i = nums[index] - 1;
        nums[index] = 0;
        while (true) {
            if (i == index) {
                nums[index] = index + 1;
                return;
            }
            if (nums[i] == 0) {
                nums[i]--;
                return;
            }
            if (nums[i] == -1) {
                resultList.add(i + 1);
                return;
            }
            if (i == nums[i] - 1) {
                resultList.add(i + 1);
                return;
            }
            int currentIndex = i;
            i = nums[i] - 1;
            nums[currentIndex] = currentIndex + 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(solution.findDuplicates(new int[]{1, 1, 2}));
        System.out.println(solution.findDuplicates(new int[]{1}));
        System.out.println(solution.findDuplicates(new int[]{10, 2, 5, 10, 9, 1, 1, 4, 3, 7}));
        System.out.println(solution.findDuplicates(new int[]{3, 11, 8, 16, 4, 15, 4, 17, 14, 14, 6, 6, 2, 8, 3, 12, 15, 20, 20, 5}));
    }
}
