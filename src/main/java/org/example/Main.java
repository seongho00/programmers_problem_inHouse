package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("He110W0r1d", 5));
    }
}