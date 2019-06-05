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
        HashMap<Character,Integer> freq = new HashMap<Character, Integer>(256);
        int l = 0, r = -1;
        int res = 0;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Code003().lengthOfLongestSubstring("pwwkew"));
    }
}
