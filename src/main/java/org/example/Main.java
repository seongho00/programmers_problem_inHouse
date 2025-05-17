package org.example;


import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            list.add(rank[i]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], list.indexOf(rank[i]));
            }
        }
        List<Integer> result_list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            result_list.add(map.get(Collections.min(map.keySet())));
            map.remove(Collections.min(map.keySet()));
        }
        answer = result_list.get(0) * 10000 + result_list.get(1) * 100 + result_list.get(2);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
    }
}