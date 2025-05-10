package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 1, "qjnwezgrpirldywt"));
    }
}