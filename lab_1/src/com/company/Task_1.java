package com.company;
import java.util.Scanner;

public class Task_1 {

    public void task_1() {
        Scanner scanf = new Scanner(System.in);
        int a, b, A, B, len_ab = 1, len_AB = 1;
        System.out.println("Введіть відрізок[a; b;]");
        if (scanf.hasNextInt()) {
            a = scanf.nextInt();
            b = scanf.nextInt();
            System.out.println("Введіть відрізок[A; B;]");
            A = scanf.nextInt();
            B = scanf.nextInt();

            for (int i = a; i < b; i++) {
                len_ab += 1;
            }
            for (int j = A; j < B; j++) {
                len_AB += 1;
            }
            System.out.println("Ймовірність того, що навмання обрана точка з відрізка [a; b;] " +
                    "належатиме відрізку [A; B] дорівнює " + len_AB + " / " + len_ab);


        } else {
            System.out.println("Input numbers pls");
        }
    }
}
