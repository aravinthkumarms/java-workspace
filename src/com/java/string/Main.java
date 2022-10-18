package com.java.string;

import com.java.string.random.Solution;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 5, 6 };
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(arr, 2));
        System.out.println(arr);
    }

}