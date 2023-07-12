package ru.geekbrains.Seminar.Sem2.HomeWork2;

import java.util.Random;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of numbers in the sequence: ");
        int n = sc.nextInt();
        System.out.println("Sum of prime numbers = " + samOfPrimeNumbers(n));
        sc.close();
    }

    /**
     * @param n кол-во чисел в последовательности N.
     * @return сумму простых чисел.
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     */
    private static int samOfPrimeNumbers(int n) {
        int sum = 0;
        Random random = new Random();
        for (int i = 1; i < n + 1; i++) {
            int x = random.nextInt(-100, 100);
            System.out.printf("x%d = %d %n", i, x);
            if (x > 1) {
                if (x == 2 || x == 3) sum += x;
                boolean isitprime = false;
                for (int j = 2; j <= Math.sqrt(x); j++) { // Math.sqrt(n2) = (n2 * 0.5) + 1 только быстрее в разы
                    if (x % j == 0) {
                        isitprime = false;  /*если делится без остатка значит есть доп делитель, кроме 1 и самого числа
                                            - число не простое*/
                        break;
                    } else {
                        isitprime = true;
                    }
                }
                if (isitprime) sum += x;
            }
        }
        return sum;
    }
}
