package org.example;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String bin1, String bin2) {

        int bin1_10 = Integer.parseInt(bin1, 2);
        int bin2_10 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(bin1_10 + bin2_10);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("1001", "1111"));
    }
}