package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        List<Integer> length = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            length.add(strArr[i].length());
        }
        length = length.stream().distinct().collect(Collectors.toList());
        Collections.sort(length);

        for (int i = 0; i < length.size(); i++) {
            int count = 0;

            for (int j = 0; j < strArr.length; j++) {

                if (length.get(i) == strArr[j].length()) {
                    count++;
                }
            }
            if (answer < count) {
                answer = count;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[]{"a", "bc", "d", "efg", "hi"}));
    }
}