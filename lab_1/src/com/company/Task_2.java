package com.company;

import java.util.Random;

public class Task_2 {
    public void task_2( int size, int x) {
        int[] numbers = new int[size];
        Random rand = new Random();
        int dx=0,k1=1,k2=2;
        System.out.println("Масив:");

        for(int i=0;i<numbers.length;i++){
            numbers[i] = rand.nextInt(100);
            System.out.println(numbers[i]);
        }
        dx=Math.abs((numbers[1]+numbers[2])/2-x);

        for(int l =1;l<size-1;l++) {
            for (int m = l + 1; m < size; m++) {
                if (Math.abs((numbers[l] + numbers[m]) / 2 - x) < dx) {
                    k1 = l;
                    k2 = m;
                    dx = Math.abs((numbers[l] + numbers[m]) / 2 - x);
                }
            }
        }
        System.out.println("-----------------");

        System.out.println("Найближче середне арефметичне до x:"+x +" це пара чисел "+ numbers[k1]+"  "+ numbers[k2]);

    }
}
