package com.company;

import java.util.*;

public class Task_4 {
    public void task_4(int n, int m, int k) {
        int[][] matrix = new int[n][m];
        int[] maxindex;
        Random rand = new Random();


        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        for (int i = 0; i < n; i++){
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }}
        maxindex = findMaximumIndex(matrix);
        System.out.println("max element ["+maxindex[0]+"] ["+maxindex[1]+"]");

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if(i==maxindex[0]||j==maxindex[1]){continue;}
                if(i<maxindex[0]||j<maxindex[1]){continue;}
                if(i%2!=0){matrix[i][j]=matrix[i][j]*k;}
                if(j%2==0){matrix[i][j]=matrix[i][j]*k;}

            }
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }}





}


    public static int[] findMaximumIndex(int[ ][ ] a)
    {
        int maxVal = -99999;
        int[] answerArray = new int[2];
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] > maxVal)
                {
                    maxVal = a[row][col];
                    answerArray[0] = row;
                    answerArray[1] = col;
                }
            }
        }
        return answerArray;
    }
}
