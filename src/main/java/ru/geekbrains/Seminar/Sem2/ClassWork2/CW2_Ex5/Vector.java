package ru.geekbrains.Seminar.Sem2.ClassWork2.CW2_Ex5;

import static java.lang.Math.sqrt;

public class Vector {
    public double x;    /*правильно использовать не public, а private, для обеспечения доступа, но для избежания
    сложностей сейчас оставляем так. Нужны будут доп. методы getter и setter.*/
    public double y;
    public double z;

    public Vector(double x, double y, double z) {   /*полный конструктор, нажать на имя класса "Vector" и нажать
    alt+insert, выбрать Constructor. Выбраны все переменные\значения*/
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {                  /*пустой конструктор - select None, нужен для работы с временными переменными
    в Main без конфликтов контсруктора.*/
    }

    @Override
    public String toString() {         /*вспомогательный метод toString для возможности в Main образаться
    ко всему объекту\классу Vector, а не черезе vector.x к значению*/
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длинну вектора
     */
    public double vectorLength() {      // создали метод для нахождения длинны вектора по формуле.
        return sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector2 вектор множитель
     * @return скалярное произведение векторов
     */
    public double vectorScalarProduct(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z; /*аналогично this.x * vector2.x + ... имеется ввиду, что
        множимым выбирается этот\this x, к которому в классе Main мы применяем\вызываем метод .vectorScalarProduct().*/
    }

    /**
     * @param vector2 вектор множитель
     * @return векторное произведение
     */
    public Vector vectorMultiply(Vector vector2) {  /*создали метод перемножение векторов, вовращаться будет Vector,
    так как формула в скобках получается длиннной, разделяем ее на строки для читабильности ?кареткой?*/
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x
        );
    }

    /**
     * @param vector2 вектор множитель, с которым происходит взаимодействие
     * @return cos угла между векторами
     */
    public double angleBetweenVectors(Vector vector2) {
        return this.vectorScalarProduct(vector2) / (this.vectorLength() * vector2.vectorLength());
    }

    /**
     *
     * @param vector2 второй слагаемый вектор
     * @return сумма векторов
     */
    public Vector vectorSum(Vector vector2) {
        return new Vector(
                x + vector2.x,
                y + vector2.y,
                z + vector2.z
        );
    }

    /**
     *
     * @param vector2 вычитаемый вектор
     * @return разница векторов
     */
    public Vector vectorDifference(Vector vector2) {
        return new Vector(
                x - vector2.x,
                y - vector2.y,
                z - vector2.z
        );
    }
}
