package org.example;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length() / n; i++) {
            list.add(my_str.substring(i * n, i * n + n));
        }
        if (my_str.length() % n != 0) {
            list.add(my_str.substring(my_str.length() / n * n, my_str.length()));
        }
        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("abcdef123", 3));
    }
}