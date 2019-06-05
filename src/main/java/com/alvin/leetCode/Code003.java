package com.alvin.leetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Description
 * Given a string,
 * find the length of the longest substring without repeating characters.
 * 解法不是很明白，先敲一遍
 * @Author 田云
 * @Date 2019/6/4 22:53
 * @Version 1.0
 */
public class Code003 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        boolean[] chars = new boolean[256]; // 256 ASCII code
        int rst = 0;
        int start = 0;
        int end = 0;
        while (start < s.length()) {
            while (end < s.length() && !chars[s.charAt(end)]) {
                chars[s.charAt(end)] = true;
                rst = Math.max(rst, end - start + 1);
                end++;
            }
            chars[s.charAt(start)] = false;
            start++;
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(new Code003().lengthOfLongestSubstring("pwwkew"));
    }
}
