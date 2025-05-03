package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while (i < n) {
            if (answer % 3 == 0) {
                answer += 1;
                continue;
            } else if (String.valueOf(answer).contains("3")) {
                answer += 1;
                continue;
            }
            answer += 1;
            i++;
        }

        return answer - 1;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(19));
    }
}