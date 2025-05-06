package org.example;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(int[][] score) {
        List<Double> AVG_sort = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            int scoreSum = 0;

            for (int j = 0; j < score[i].length; j++) {
                scoreSum += score[i][j];
            }
            AVG_sort.add((double) scoreSum / (double) score[0].length);
        }

        List<Double> AVG = new ArrayList<>(AVG_sort);
        Collections.sort(AVG_sort, Collections.reverseOrder());
        for (Double avg : AVG) {
            int avg_int = (int) (avg * 10);
            for (int j = 0; j < AVG_sort.size(); j++) {
                if ((int) (AVG_sort.get(j) * 10) == avg_int) {
                    answer.add(j + 1);
                    break;
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[][]{{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {1, 1}}));
    }
}