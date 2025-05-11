package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));

        for (int i = 0; i < indices.length; i++) {
            list.set(indices[i], "");
        }
        return String.join("", list);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}