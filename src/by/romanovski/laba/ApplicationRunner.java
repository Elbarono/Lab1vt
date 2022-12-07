package by.romanovski.laba;

import by.romanovski.laba.task1.FunctionCounter;
import by.romanovski.laba.task2.PointLocation;
import by.romanovski.laba.task3.TanCounter;
import by.romanovski.laba.task4.PrimeValidator;
import by.romanovski.laba.task5.LongestSequence;
import by.romanovski.laba.task6.MatrixChanger;
import by.romanovski.laba.task7.ShellSort;
import by.romanovski.laba.task8.MergeArrays;

public class ApplicationRunner {

    public static void main(String[] args) {
        System.out.println("\nПосчитать значение функции");
        new FunctionCounter().testFunction();
        System.out.println("\nНаходится ли точка в прямоугольнике");
        new PointLocation().testFunction();
        System.out.println("\nПосчитать тангенс");
        new TanCounter().testFunction();
        System.out.println("\nЯвляется ли число простым");
        new PrimeValidator().testFunction();
        System.out.println("\nИзменить матрицу");
        new MatrixChanger().testFunction();
        System.out.println("\nСмержить массивы");
        new MergeArrays().testFunction();
        System.out.println("\nНаименьшее количество выкинутых чисел");
        new LongestSequence().testFunction();
        System.out.println("\nСортировка Шелла");
        new ShellSort().testFunction();
    }

}
