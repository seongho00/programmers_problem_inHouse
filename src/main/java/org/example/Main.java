package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10}));
    }
}