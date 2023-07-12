package ru.geekbrains.Seminar.Sem2.ClassWork2;

public class CW2_Ex1 {
    public static void main(String[] args) {
        int[] array = {2, 6, 5, 8, 5, 6, 2};
        System.out.println(Palindrom(array));
    }

    /**
     * @param array входной массив.
     * @return результат проверки в формате true or false.
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     */
    private static boolean Palindrom(int[] array) {
//        boolean flag = false; // можно не писать, работает по умолчанию.
        int len = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[len - i]) return false;
//            len--; // не нкжно если оптимизоровать str 12: array[len - i}.
        }
        return true;
    }
}
