package twoSum;
/*
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 * Return the answer with the smaller index first.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i=0; i < nums.length; i++) {
            int requiredNum = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == requiredNum) {
                    return new int[] { i, j };
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{3, 4, 5, 6}, 7);
        System.out.println(result);
    }
}
