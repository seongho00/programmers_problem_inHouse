package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] common) {
        if (common[0] - common[1] == common[1] - common[2]) {
            int diff = common[1] - common[0];
            return common[common.length - 1] + diff;
        } else {
            int diff = common[1] / common[0];
            return common[common.length - 1] * diff;

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{2, 4, 8}));
    }
}