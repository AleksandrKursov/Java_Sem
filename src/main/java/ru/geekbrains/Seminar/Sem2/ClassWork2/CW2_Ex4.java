package ru.geekbrains.Seminar.Sem2.ClassWork2;

import java.util.Scanner;

public class CW2_Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a length of array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Input a numbers of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("Amount of pairs = " + task3(array));

    }

    /**
     * @param array входной массив.
     * @return Кол-во пар элементов, где первый элемент вдвое больше второго.
     * @apiNote Дан массив целых чисел. Найти количество пар соседних элементов,
     * где первый элемент вдвое больше второго.
     */
    private static int task3(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] * 2) {
                count++;
            }
        }
        return count;
    }
}
