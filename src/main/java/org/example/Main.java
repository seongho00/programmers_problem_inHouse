package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int start_index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start_index = i;
                break;
            }
        }
        if (start_index == -1) {
            answer.add(-1);
            return answer;
        }
        int end_index = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 2) {
                end_index = i;
                break;
            }
        }
        for (int i = start_index; i <= end_index; i++) {
            answer.add(arr[i]);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 1, 4, 5, 2, 9}));
    }
}