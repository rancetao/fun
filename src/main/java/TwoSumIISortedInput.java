package main.java;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * <p>
 * Output: index1=1, index2=2
 */

public class TwoSumIISortedInput {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) {
            return new int[0];
        }

        if (numbers.length == 2) {
            if (numbers[0] + numbers[1] != target) {
                return new int[0];
            }

            return new int[]{1, 2};
        }

        int low = 0;
        int high = numbers.length-1;

        while (low < high) {
            int temp = numbers[low] + numbers[high];
            if (temp == target) {
                return new int[]{low+1, high+1};
            } else if (temp < target) {
                low++;
            } else {
                high--;
            }
        }

        return new int[0];
    }
}
