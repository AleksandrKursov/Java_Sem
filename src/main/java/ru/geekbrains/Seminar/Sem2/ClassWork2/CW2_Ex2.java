package ru.geekbrains.Seminar.Sem2.ClassWork2;

import java.util.Arrays;
import java.util.Scanner;

public class CW2_Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a length of array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Input a numbers of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int[] resArray = sumNumbers(array);
        for (int el : resArray) {
            System.out.print(el + " ");
        }
    }

    /**
     * @param array входной массив.
     * @return Возвращает новый массив с промежуточной суммой .nums.
     * @apiNote Задан массив. Мы определяем промежуточную сумму массива
     * как .numsrunningSum[i] = sum(nums[0]...nums[i]).
     */
    private static int[] sumNumbers(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
