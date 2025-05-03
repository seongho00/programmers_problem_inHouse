package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        for (int i = 2; i <= a; i++) {
            if (b % i == 0 && a % i == 0) {
                a /= i;
                b /= i;
                i--;
            }
        }

        for (int i = 2; i <= b; i++) {
            if (b % 2 == 0) {
                b /= 2;
                i--;
            }
            if (b % 5 == 0) {
                b /= 5;
                i--;
            }
        }
        if (b != 1) {
            return 2;
        }

        return 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(12, 21));
    }
}