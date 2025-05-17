package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(1.42));
    }
}