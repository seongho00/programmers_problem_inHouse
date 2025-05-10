package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> list = new ArrayList<>();
        String answer = "";
        while (!my_string.isEmpty()) {
            String str = my_string.substring(0, m);
            list.add(str);
            my_string = my_string.substring(m);
        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i).charAt(c - 1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("ihrhbakrfpndopljhygc", 4, 2));
    }
}