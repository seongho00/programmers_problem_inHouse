package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int M, int N) {
        return M * N - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 4));
    }
}