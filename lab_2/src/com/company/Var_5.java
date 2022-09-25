package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Var_5 {
    public void matrix_min_number(int size) {
         Long negative_counter =0L;
        Scanner scanf = new Scanner(System.in);
        Float[][] a = new Float[size][size];
         Float[] matrixnum = new Float[size*size];
        Random r=new Random();


        System.out.println("Введіть масив:");
        System.out.println();
        System.out.println("Все що ви вводите має бути числом. ");
        System.out.println("У масиві має бути хоча б одне відєине від нуля число.");
        System.out.println();
        System.out.println("Додаткові правила:");
        System.out.println("0.Сумма головної діагоналі має бути більше 0.");
        System.out.println("1.Сумма побічної діагоналі має бути більше 0.");

        int one_more_quest = r.nextInt(2);
        System.out.println("Ваше додатековє правило №"+one_more_quest);


         for(int p =0; p<size*size;p++) {
             if (scanf.hasNextFloat()) {
                 Float next = scanf.nextFloat();
                     matrixnum[p] = next;

             } else {
                 System.out.println("Це не число");
                 System.exit(0);
             }
         }


         negative_counter= Arrays.stream(matrixnum).filter(i -> i < 0).count();


         if(negative_counter == 0){
             System.out.println("Ваш масив не має жодного негативного числа");
             System.exit(0);
         }


        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++)
                    a[i][j] =  matrixnum[i * a[j].length + j];}

        switch (one_more_quest){
            case 0: {
                double main_sum=IntStream.range(0,a.length).mapToDouble(i -> a[i][i]).sum();
                if(main_sum>0){
                    System.out.println("Сумма головної діагоналі більше 0 ");
                    break;

                }else {System.out.println("Сумма головної діагоналі менше 0 ");
                    System.exit(0);
                }


            }
            case 1: {
                double seconds_sum= IntStream.range(0,a.length).mapToDouble(i -> a[i][a.length-1-i]).sum();
                if(seconds_sum>0){
                    System.out.println("Сумма побічної діагоналі більше 0 ");
                    break;

                }else {System.out.println("Сумма побічної діагоналі менше 0 ");
                System.exit(0);
                }

            }
        }


        System.out.println("Ваша матриця: ");

            for (int l = 0; l < size; l++) {
                for (int k = 0; k < size; k++){
                    System.out.print(a[l][k] + " ");}
                System.out.println();

            }
        double min = Arrays.stream(matrixnum)
                .min(Double::compare)
                .get();
            System.out.println("Ваше мінімальне число: "+min);


        }
    }




