package org.example;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.endsWith(is_suffix)) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("banana", "ana"));
    }
}