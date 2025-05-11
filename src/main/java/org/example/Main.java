package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                answer.add(arr[j]);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}}));
    }
}