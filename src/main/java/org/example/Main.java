package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        for (int i = my_string.length(); i > 0; i--) {
            answer.add(my_string.substring(i - 1));
        }
        Collections.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("banana"));
    }
}