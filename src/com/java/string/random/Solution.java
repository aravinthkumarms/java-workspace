package com.java.string.random;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int loop = 0;
        boolean notPresent = false;
        while (loop <= nums.length - 1) {
            mid = (low + high) / 2;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
            loop = loop + 1;
        }
        if (loop > nums.length - 1) {
            notPresent = true;
        }
        if (notPresent) {
            nums[nums.length - 1] = target;
            Arrays.sort(nums);
            return IntStream.range(0, nums.length)
                    .filter(i -> target == nums[i])
                    .findFirst() // first occurrence
                    .orElse(-1);

        }
        return mid;
    }
}