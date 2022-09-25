package com.company;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task_3 {
    public void task_3(int size,int k){
        int[][] matrix = new int[size][size];
        int[] diagonals = new int[size];
        Random rand = new Random();

        for(int i=0;i<matrix.length;i++)
            for (int j=0;j< matrix.length;j++){
                matrix[i][j]= rand.nextInt(10);
                if(i==j){diagonals[i]=matrix[i][j];}
            }
        System.out.println("Ваша митриця");


        for(int i=0;i<matrix.length;i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j]+" ");
            }
        }

        for(int p=0;p<size;p++){
            matrix[p][k-1] = matrix[p][k-1]-diagonals[p];
        }



        System.out.println();
        System.out.println("Від стовчика "+k + " віднімаємо діагональні елементи");
        System.out.println("Результат:");

        for(int i=0;i<matrix.length;i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j]+" ");
            }
        }



    }


}
