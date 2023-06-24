package ru.geekbrains.Seminar.Sem1.ClassWork;

import java.util.Scanner;

public class Example_1 {

    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("subtractProductAndSum(n) = " + subtractProductAndSum(n));
        scanner.close();
    }

    /**
     * @param n заданное число
     * @return результат
     * @apiNote Для заданного целого числа n верните разницу между произведением его цифр и суммой его цифр.
     */
    private static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n != 0) {
            product *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return product - sum;
    }
}
