package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B)) {
            return 0;
        }
        for (int i = 0; i < A.length(); i++) {
            char last_char = A.charAt(A.length() - 1);
            A = last_char + A.substring(0, A.length() - 1);
            answer++;
            if (A.equals(B)) {
                return answer;
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("apple", "tata"));
    }
}