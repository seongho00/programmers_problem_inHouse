package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {


        if (arr.length % 2 == 0) {
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = arr[i] + n;
            }
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] = arr[i] + n;
            }
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{49, 12, 100, 276, 33}, 27));
    }
}