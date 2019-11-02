/**
 * @author Steven
 * @create 2019/11/2 14:37
 * @Description: 给定一个 n × n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 */
package com.steven.leecode.arrays;

public class Solution11 {
    // 旋转后的对应规则 num[i][j]==>num[j][n-1-i]
    public static void rotate(int[][] matrix) {
        int len = matrix[0].length;
        for(int i=0;i<len/2;i++)
        {
            for(int j=i;j<len-1-i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[len-1-j][i];
                matrix[len-1-j][i]=matrix[len-1-i][len-1-j];
                matrix[len-1-i][len-1-j]=matrix[j][len-1-i];
                matrix[j][len-1-i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        int len = matrix[0].length;
        print(matrix,len);
        rotate(matrix);
        System.out.println();
        print(matrix,len);


    }

    public static void print(int[][] matrix,int len){
        for (int i = 0; i < len; i++) {
            System.out.print("[");
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("]");
        }
    }

}
