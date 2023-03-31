import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int characterReplacement(String s, int k) {

        //sliding window problem

        var res = 0;
        Map<Character, Integer> map = new HashMap<>(); //'A' = 65

        var leftPointer = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char charAt = s.charAt(rightPointer);
            if (map.get(charAt) == null) {
                map.put(charAt, 1);
            } else {
                map.put(charAt, map.get(charAt) + 1);
            }

            if ((rightPointer - leftPointer + 1) - map.values().stream().mapToInt(v -> v).max().orElse(0) > k) {
                map.put(s.charAt(leftPointer), map.get(s.charAt(leftPointer)) - 1);
                leftPointer++;

            }
            res = Math.max(res, rightPointer - leftPointer + 1);


        }

        return res;
    }

}