package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toLowerCase();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            words.add(String.valueOf((char) (i + 97)));
        }
        for (int i = 0; i < words.size(); i++) {
            my_string = my_string.replaceAll(words.get(i), " ");
        }
        List<String> numbers = Arrays.asList(my_string.split(" "));

        for (int i = 0; i < numbers.size(); i++) {
            try {
                answer += Integer.parseInt(numbers.get(i));

            } catch (Exception e) {
                
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("aAb1B2cC34oOp"));
    }
}