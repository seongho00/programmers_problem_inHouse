package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int num, int total) {
        List<Integer> answer = new ArrayList<>();
        if (total % num == 0) {
            for (int i = 0; i < num; i++) {

                int number = i - num / 2;
                answer.add(total / num + number);

            }
        } else {
            for (int i = 0; i < num; i++) {
                int number = i - num / 2 + 1;
                answer.add(total / num + number);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(4, 14));
    }
}