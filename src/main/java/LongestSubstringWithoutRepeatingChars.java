package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        char[] characters = s.toCharArray();
        int length = characters.length;
        if (length == 0) return 0;
        if (length == 1) return 1;
        Map<Character, Integer> dict = new HashMap<>();
        int result = 1;
        for (int i = 0, j = 0; j < length; j++) {
            if (dict.containsKey(characters[j])) {
                i = Math.max(dict.get(characters[j]), i);
            }
            result = Math.max(result, j - i + 1);
            dict.put(characters[j], j + 1);

        }
        return result;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
        longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring("abcabcbb");
    }
}
