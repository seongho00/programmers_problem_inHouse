package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public List<Integer> solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        int i = 1;
        while (k * i <= n && k > 0) {
            answer.add(k * i);
            i++;

        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(15, 5));
    }
}