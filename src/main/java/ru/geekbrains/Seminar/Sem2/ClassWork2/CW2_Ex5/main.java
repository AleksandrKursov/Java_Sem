package ru.geekbrains.Seminar.Sem2.ClassWork2.CW2_Ex5;

public class main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3); // назначаем значения в атрибутах класса, если есть конструктор.
        Vector vector2 = new Vector(1, 1, 1);
//        vector.x = 1; // присвоение значений переменным, если класс vector без конструктора.
//        vector.y = 2;
//        vector.z = 3;
        System.out.println("vector2.vectorLength() = " + vector2.vectorLength());
        System.out.println("vector1.vectorScalarProduct(vector2) = " + vector1.vectorScalarProduct(vector2));
        //для создания нового метода в классе Vector мы назначем новый метода какому-нибудь объекту\атрибуту, нажимаем
        //alt + enter и выбираем создать метод. Во входящих значения указываем объесты\переменные взаимодействия.
        System.out.println("vector1.vectorMultiply(vector2) = " + vector1.vectorMultiply(vector2));
        System.out.println("vector1.angleBetweenVectors(vector2, vector1) = " + vector1.angleBetweenVectors(vector2));
        System.out.println("vector1.vectorSum(vector2) = " + vector1.vectorSum(vector2));
        System.out.println("vector1.vectorDifference(vector2) = " + vector1.vectorDifference(vector2));
    }
}
