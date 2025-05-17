package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("123456789"));
    }
}