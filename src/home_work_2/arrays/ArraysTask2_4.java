package home_work_2.arrays;

import java.util.Scanner;

public class ArraysTask2_4 {
    public static void main(String[] args) {
        // задачи с массивами

        int[] mas;

        mas = home_work_2.arrays.ArraysUtils.arrayRandom(50, 100);


        // вызов методов решения задач и вывод результатов в консоль
        System.out.println("Cумма четных положительных элементов массива: " + sumPosElements(mas));
        System.out.println();

        System.out.println("Максимальный из элементов массива с четными индексами: " + maxElements(mas));
        System.out.println();

        System.out.println("Элементы массива, которые меньше среднего арифметического:" + averageElements(mas));
        System.out.println();

        System.out.println("Два наименьших элемента массива:");
        System.out.println(twoMinElements(mas));
        System.out.println();

        System.out.println("Массив после удаления элементов:" + compressionArray(mas));
        System.out.println();

        System.out.println("Сумма цифр элементов массива:" + sumOfDigits(mas));
        System.out.println();
    }

    // Метод для нахождения суммы четных положительных элементов массива
    public static int sumPosElements(int[] mas) {
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0 & mas[i] % 2 == 0) {
                sum = sum + mas[i];
            }
        }
        return sum;
    }

    // Метод для нахождения максимального из элементов массива с четными индексами
    public static int maxElements(int[] mas) {
        int max;
        int length;

        length = mas.length;

        max = 0;
        for (int i = 0; i < mas.length; i += 2) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }

    // Метод для нахождения элементов массива, которые меньше среднего арифметического
    public static String averageElements(int[] mas) {
        int min;
        int sum;
        int average;
        String result = "";

        sum = 0;
        min = 0;

        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }

        average = sum / mas.length;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < average) {
                min = mas[i];
                result = result + " " + mas[i];
            }
        }
        return result;
    }

    // Метод для нахождения двух наименьших элементов массива
    public static String twoMinElements(int[] mas) {
        int minFirst;
        int minSecond;
        int count;
        String result = "";

        minFirst = mas[0];
        count = 0;

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < minFirst) {
                minFirst = mas[i];
                count = i;
            }
        }

        if (minFirst == mas[0]) {
            minSecond = mas[1];
        } else {
            minSecond = mas[0];
        }

        for (int i = 1; i < mas.length; i++) {
            if (i < count | i > count) {
                if (mas[i] < minSecond) {
                    minSecond = mas[i];
                }
            }
        }
        result = ("minFirst = " + minFirst + "\nminSecond = " + minSecond);

        return result;
    }

    // Метод для cжатия массива, удалив элементы, принадлежащие интервалу
    public static String compressionArray(int[] mas) {
        int[] masSecond;
        int a;
        int b;
        int j;
        String result;


        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите интервал, в котором удалить эелементы: >");
        a = sc.nextInt();
        System.out.println("> ");
        b = sc.nextInt();

        masSecond = new int[mas.length];
        j = a;
        result = "";

        for (int i = 0; i < a; i++) {
            masSecond[i] = mas[i];
        }

        for (int i = b + 1; i > b & i < mas.length; i++) {
            masSecond[j] = mas[i];
            j++;
        }

        for (int i = 0; i < masSecond.length; i++) {
            result = result + " " + masSecond[i];
        }
        return result;
    }

    // Метод для нахождения суммы цифр массива
    public static int sumOfDigits(int[] mas) {
        int num;
        int numberOne;
        int sum;

        sum = 0;

        for (int i = 0; i < mas.length; i++) {
            num = mas[i];
            while (num != 0) {
                numberOne = num % 10;
                sum = sum + numberOne;
                num = num / 10;
            }

        }
        return sum;
    }
}
