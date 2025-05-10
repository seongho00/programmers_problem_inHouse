package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public String solution(String my_string, int n) {

        return my_string.substring(0, n);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("ProgrammerS123", 11));
    }
}