package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        List<String> my_words = Arrays.asList(my_string.split(""));

        return String.join("",  my_words.stream().distinct().collect(Collectors.toList()));
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("people"));
    }
}