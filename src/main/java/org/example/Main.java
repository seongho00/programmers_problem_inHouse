package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[][] dots) {
        int i = 0;
        int first_dot = 0;
        int second_dot = 1;
        int third_dot = 2;
        int fourth_dot = 3;
        while (i < 3) {
            if (second_dot == 2) {
                third_dot = 1;
            }
            if (second_dot == 3) {
                fourth_dot = 1;
            }
            int fir_inclination_x = dots[first_dot][0] - dots[second_dot][0];
            int fir_inclination_y = dots[first_dot][1] - dots[second_dot][1];
            double fir_inclination = (double) fir_inclination_x / fir_inclination_y;

            int sec_inclination_x = dots[third_dot][0] - dots[fourth_dot][0];
            int sec_inclination_y = dots[third_dot][1] - dots[fourth_dot][1];

            double sec_inclination = (double) sec_inclination_x / sec_inclination_y;

            if (fir_inclination == sec_inclination) {
                return 1;
            }

            second_dot++;
            i++;
        }


        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
    }
}