package main.java;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int k = 0; k < nums.length; k++) {
            for (int i = k + 1; i < nums.length; i++) {
                if (nums[i] == target - nums[k]) {
                    return new int[]{k, i};
                }
            }
        }
        return null;
    }
}
