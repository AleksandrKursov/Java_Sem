package ru.geekbrains.Seminar.Sem1.HomeWork;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        System.out.println("Input a sequence of numbers: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of positive numbers followed by negative numbers = " + SumPositiveNumbers(scanner));
        scanner.close();
    }

    /**
     * @param scanner переменная, хранящая введенное в консоле значение.
     * @return Сумма положит. чисел, после которых слудуют отрицат.
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
     * после которых следует отрицательное число
     */
    private static int SumPositiveNumbers(Scanner scanner) {
        int sum = 0, b = 0;
        int a = scanner.nextInt();
        while (a != 0) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) sum += a;
            a = b;
        }
        return sum;
    }
}
