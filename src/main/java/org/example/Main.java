package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String temp = my_string.substring(s, e + 1);
        StringBuffer temp_sb = new StringBuffer(temp);
        String reverse_temp = temp_sb.reverse().toString();

        my_string = my_string.substring(0, s) + reverse_temp + my_string.substring(e + 1);

        return my_string;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("Progra21Sremm3", 6, 12));
    }
}