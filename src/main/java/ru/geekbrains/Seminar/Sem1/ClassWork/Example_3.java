package ru.geekbrains.Seminar.Sem1.ClassWork;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Modified string: " + zadanie3(str));
        scanner.close();
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param str Введенная строка.
     * @return Новая строка с измененной последовательностью половин строки.
     */
    private static String zadanie3(String str) {
        String startLine = str.substring(0, str.length() / 2);
        String endLine = str.substring(str.length() / 2);
        return endLine + startLine;
    }
}
