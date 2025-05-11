package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = num_list.length - 1;
        int interval = 1;
        if (n == 1) {
            end = slicer[1];

        } else if (n == 2) {
            start = slicer[0];

        } else if (n == 3) {
            start = slicer[0];
            end = slicer[1];

        } else {
            start = slicer[0];
            end = slicer[1];
            interval = slicer[2];

        }
        for (int i = start; i <= end; i += interval) {
            answer.add(num_list[i]);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(2, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}