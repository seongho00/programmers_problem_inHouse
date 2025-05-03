package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int rowMinus;
        int colMinus;
        int rowPlus;
        int colPlus;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1) {
                    if (row - 1 < 0) {
                        rowMinus = 0;
                    } else {
                        rowMinus = row - 1;
                    }
                    if (row + 1 > board.length - 1) {
                        rowPlus = board.length - 1;
                    } else {
                        rowPlus = row + 1;
                    }

                    if (col - 1 < 0) {
                        colMinus = 0;
                    } else {
                        colMinus = col - 1;
                    }
                    if (col + 1 > board[row].length - 1) {
                        colPlus = board.length - 1;
                    } else {
                        colPlus = col + 1;
                    }


                    board[row][colPlus] = board[row][colPlus] == 1 ? 1 : 2;
                    board[row][colMinus] = board[row][colMinus] == 1 ? 1 : 2;
                    board[rowMinus][col] = board[rowMinus][col] == 1 ? 1 : 2;
                    board[rowMinus][colMinus] = board[rowMinus][colMinus] == 1 ? 1 : 2;
                    board[rowMinus][colPlus] = board[rowMinus][colPlus] == 1 ? 1 : 2;
                    board[rowPlus][col] = board[rowPlus][col] == 1 ? 1 : 2;
                    board[rowPlus][colMinus] = board[rowPlus][colMinus] == 1 ? 1 : 2;
                    board[rowPlus][colPlus] = board[rowPlus][colPlus] == 1 ? 1 : 2;
                }
            }
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0) {
                    answer++;
                }
            }
        }
        return answer;

    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
    }
}