package ru.geekbrains.Seminar.Sem1.ClassWork;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        System.out.println("Input a sequence of numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Amount of changes from positive numbers to negative = " + CounterChangesPosNumbToNeg(n, scanner));
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
     * @param n - Кол-во чисел в последовательности чисел.
     * @param scanner -
     * @return Кол-во положительных чисел, после которых следует отрицательное.
     */
    private static int CounterChangesPosNumbToNeg(int n, Scanner scanner) {
        int count = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) count++;
            a = b;
        }
        scanner.close();
        return count;
    }
}
