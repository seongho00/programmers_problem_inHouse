package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int a = Integer.parseInt(String.valueOf(intStrs[i]).substring(s, s + l));
            if (a > k) {
                answer.add(a);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"0123456789", "9876543210", "9999999999999" }, 50000, 5, 5));
    }
}