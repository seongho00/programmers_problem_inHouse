package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            answer.add(0);
        }
        for (int i = 0; i < my_string.length(); i++) {
            int char_index = 0;
            if (Character.isUpperCase(my_string.charAt(i))) {
                char_index = my_string.charAt(i) - 65;
            } else {
                char_index = my_string.charAt(i) - 71;

            }
            answer.set(char_index, answer.get(char_index) + 1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("Programmers"));
    }
}