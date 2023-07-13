package ru.geekbrains.Seminar.Sem2.HomeWork2;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of numbers in the sequence: ");
        int n = sc.nextInt();
        System.out.printf("Is the sequence increasing? - %b %n", isTheSequenceIncreasing(n, sc));
        sc.close();
    }

    /**
     * @param n кол-во чисел в последовательности N.
     * @param scan вспомогательная переменная.
     * @return Булево значение на вопрос "является ли последовательность возрастающей?"
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     */
    private static boolean isTheSequenceIncreasing(int n, Scanner scan) {
        System.out.println("Input a sequence of numbers: ");
        int numb1 = scan.nextInt();
        boolean isItIncreasing = false;
        for (int i = 0; i < n - 1; i++) {
            int numb2 = scan.nextInt();
            if (numb2 > numb1) {
                isItIncreasing = true;
            } else {
                return isItIncreasing = false;
            }
            numb1 = numb2;
        }
        return isItIncreasing;
    }
}