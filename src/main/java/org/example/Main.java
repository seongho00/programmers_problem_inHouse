package org.example;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick" }, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}