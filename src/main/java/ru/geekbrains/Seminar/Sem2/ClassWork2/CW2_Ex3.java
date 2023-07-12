package ru.geekbrains.Seminar.Sem2.ClassWork2;

import java.util.Scanner;

public class CW2_Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of numbers in the sequence: ");
        int n = scan.nextInt();
        System.out.println(task2(n, scan));
        scan.close();
    }

    /**
     * @param n    длина последовательности.
     * @param scan вспомогательная переменная.
     * @return Сумма чисел последовательности, отвечающая условиям задания.
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел,
     * оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int task2(int n, Scanner scan) {
        int sum = 0;

        System.out.println("Input a sequence of numbers: ");
        int n1 = scan.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scan.nextInt();
            if (n2 % 10 == 5 && n1 % 2 == 0) {
                sum += n2;
            }
            n1 = n2;
        }
        return sum;
    }
}
