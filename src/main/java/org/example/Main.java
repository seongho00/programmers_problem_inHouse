package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            return a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        } else {
            return Math.abs(a - b);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3, 5));
    }
}