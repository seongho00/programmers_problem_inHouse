package org.example;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] sides) {
        int count = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        int diff = max - min;
        int sum = max + min;


        while (diff != max) {
            diff++;
            count++;
        }

        while (max + 1 != sum) {
            count++;
            max++;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{11, 7}));
    }
}