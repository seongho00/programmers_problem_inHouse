package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] date1, int[] date2) {

        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        } else {
            if (date1[1] < date2[1]) {
                return 1;
            } else if (date1[1] > date2[1]) {
                return 0;
            } else {
                if (date1[2] < date2[2]) {
                    return 1;
                } else if (date1[2] > date2[2]) {
                    return 0;
                } else {
                    return 0;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));

    }
}