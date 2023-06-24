package ru.geekbrains.Seminar.Sem1.ClassWork;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("SumBinary() = " + SumBinary(a, b));
        scanner.close();
    }

    /**
     * @return
     * @apiNote
     */
    private static String SumBinary(String a, String b) {
        if (a.length() < b.length()) {
            return SumBinary(b, a);
        }
        int carriage = 0; // todo: Проверить валидность названия.
        int j = b.length() - 1;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carriage++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carriage++;
            }
            result = carriage % 2 + result;
            carriage /= 2;
            j--;
        }
        if (carriage > 0) {
            result = carriage % 2 + result;
        }
        return result;
    }
}
