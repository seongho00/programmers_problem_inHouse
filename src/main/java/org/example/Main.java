package org.example;


import java.util.Collections;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int chicken) {
        return coupon(chicken);
    }

    int coupon(int coupon_count) {
        int coupon_remain_count = coupon_count % 10;
        int coupon_chicken = coupon_count / 10;
        if (coupon_remain_count + coupon_chicken >= 10) {
            return coupon_chicken + coupon(coupon_chicken + coupon_remain_count);
        }
        return coupon_chicken;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(100));
    }
}