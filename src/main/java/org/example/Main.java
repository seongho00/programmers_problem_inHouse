package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
                dic[i] = dic[i].replaceAll(spell[j], String.valueOf(j));
            }
            int answer = 0;

            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(String.valueOf(j))) {
                    answer++;
                }

                if (answer == spell.length) {
                    return 1;
                }
            }
        }
        return 2;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }
}