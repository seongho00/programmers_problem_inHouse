package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("banana", "ana"));
    }
}