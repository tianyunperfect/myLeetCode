package com.alvin.leetCode;

/**
 * @Description Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @Author 田云
 * @Date 2019/6/3 22:56
 * @Version 1.0
 */
public class Code001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        int[] ints = new Code001().twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
