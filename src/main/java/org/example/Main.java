package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            answer.add(i);
        }
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = answer.subList(0, query[i] + 1);

            } else {
                answer = answer.subList(query[i], answer.size());
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{2, 1, 2}));
    }
}