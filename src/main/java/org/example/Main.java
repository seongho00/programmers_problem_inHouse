package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                return 1;
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5}, 3));
    }
}