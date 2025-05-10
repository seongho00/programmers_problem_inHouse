package org.example;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(String before, String after) {
        for (char before_c : before.toCharArray()) {
            for (int j = 0; j < after.length(); j++) {
                if (before_c == after.charAt(j)) {
                    after = after.substring(0, j) + after.substring(j + 1);
                    break;
                }
            }
        }
        if (after.isEmpty()) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("olleh", "hello"));
    }
}