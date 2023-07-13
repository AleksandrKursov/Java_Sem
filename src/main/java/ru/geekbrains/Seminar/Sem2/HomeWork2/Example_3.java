package ru.geekbrains.Seminar.Sem2.HomeWork2;

public class Example_3 {
    /**
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     */
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        System.out.print("Source array: ");
        for (int elem : array) {
            System.out.print(elem + ", ");
        }
        System.out.println();
        int[] newArray = replacementNegElem(sumIndicesTwodigitNumbers(array), array);
        System.out.print("Changed array: ");
        for (int elem : newArray) {
            System.out.print(elem + ", ");
        }
    }

    /**
     * @param sumIndices Сумма индексов двузначных элементов исходного массива.
     * @param array      Исходный массив.
     * @return Массив с замененными отрицательными элементами на сумму индексов.
     */
    private static int[] replacementNegElem(int sumIndices, int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) array[j] = sumIndices;
        }
        return array;
    }

    /**
     * @param array Исходный массив.
     * @return Сумма индексов двузначных элементов массива.
     */
    private static int sumIndicesTwodigitNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                sum += i;
            }
        }
        return sum;
    }
}
