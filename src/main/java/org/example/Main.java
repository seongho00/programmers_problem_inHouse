package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int index = i; index <= j; index++) {
            List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(index).split("")));
            for (int index_j = 0; index_j < list.size(); index_j++) {
                if (list.get(index_j).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(1, 13, 1));
    }
}