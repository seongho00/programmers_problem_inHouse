package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            if (arr1.length > arr2.length) {
                return 1;
            }
            return -1;
        }
        int arr1sum = 0;
        int arr2sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2sum += arr2[i];
        }
        if (arr1sum == arr2sum) {
            return 0;
        } else {
            if (arr1sum > arr2sum) {
                return 1;
            }
            return -1;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{49, 13}, new int[]{70, 11, 2}));
    }
}