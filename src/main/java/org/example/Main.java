package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String n_str) {

        if (n_str.charAt(0) == '0') {
            for (int i = 0; i < n_str.length(); i++) {
                if (n_str.charAt(i) == '0') {
                    continue;
                }
                n_str = n_str.substring(i);
                break;
            }
        }

        return n_str;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("000150040048500"));
    }
}