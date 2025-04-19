package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Solution {

    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        // 최댓값 구하기
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
            }
        }
        // 나머지 값 합치기
        for (int i = 0; i < sides.length; i++) {
            if (max == sides[i]) {
                sides[i] = 0;
                break;
            }
        }

        for (int i = 0; i < sides.length; i++) {
            sum += sides[i];
        }

        // 두 값 비교
        if (sum > max) {
            return 1;
        }

        return 2;
    }

}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{1, 2, 3}));
    }
}