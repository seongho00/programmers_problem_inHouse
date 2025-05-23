package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[][] solution(int[][] arr) {
        int length = 0;
        if (arr.length > arr[0].length) {
            length = arr.length;
        } else {
            length = arr[0].length;
        }
        int[][] answer = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}}));
    }
}
