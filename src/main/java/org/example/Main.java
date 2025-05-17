package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList(num_str.split("")));
        for (int i = 0; i < list.size(); i++) {
            answer += Integer.parseInt(list.get(i));
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("123456789"));
    }
}