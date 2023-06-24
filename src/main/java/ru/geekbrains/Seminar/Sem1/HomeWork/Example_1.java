package ru.geekbrains.Seminar.Sem1.HomeWork;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Words in a string in reverse order: " + reverseWords(str));
        scanner.close();
    }

    /**
     * @param str введенная строка
     * @return Строка с измененным порядком слов.
     * @apiNote Учитывая входную строку s, измените порядок слов на противоположный .
     * Слово определяется как последовательность не пробельных символов. Слова в s будут разделены хотя бы одним
     * пробелом. Возвращает строку слов в обратном порядке, объединенных одним пробелом.
     * Обратите внимание , что s может содержать начальные или конечные пробелы или несколько пробелов между
     * двумя словами. Возвращаемая строка должна содержать только один пробел, разделяющий слова.
     * Не включайте никаких дополнительных пробелов.
     */
    private static String reverseWords(String str) {
        String[] reversString = str.replaceAll("\\s+", " ").trim().split(" ");
        var temp = " ";
        for (int i = 0; i < reversString.length / 2; i++) {
            temp = reversString[i];
            reversString[i] = reversString[reversString.length - i - 1];
            reversString[reversString.length - i - 1] = temp;
        }
        return String.join(" ", reversString);
    }
}
