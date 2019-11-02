/**
 * @author Steven
 * @create 2019/11/2 13:27
 * @Description: 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */
package com.steven.leecode.arrays;

import java.util.Arrays;

public class Solution10 {

    public static boolean isValidSudoku(char[][] board) {
        boolean result = true;
        boolean[] visited = new boolean[9];
        boolean[] visited2 = new boolean[9];
        boolean[] visited3 = new boolean[9];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(visited,false);
            Arrays.fill(visited2,false);
            for (int j = 0; j < 9; j++) {
                // 行判断
                if(!hasSet(visited,board[i][j])){
                    result = false;
                }
                // 列判断
                if(!hasSet(visited2,board[j][i])){
                    result = false;
                }
                // 矩阵判断
                if((i%3 == 0) && (j%3 == 0)){
                    Arrays.fill(visited3,false);
                    for (int k = 0; k < 9; k++) {
                        if(!hasSet(visited3,board[i+k/3][j+k%3])){
                            result = false;
                        }
                    }
                }

            }
        }

        return result;
    }

    public static boolean hasSet(boolean[] visited,char element ){
        if(element == '.'){
            return true;
        }
        int num = element - '0';
        if(num <1 || num >9 || visited[num-1]){
            return false;
        }
        visited[num-1] = true;
        return true;
    }

    public static void main(String[] args) {
        char[][] nums = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(nums));
    }
}
