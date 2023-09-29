package task1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    // Метод для выполнения задачи 3
    public static void task3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Кол-во элементов: ");
        int N = input.nextInt();
        int[] a = new int[N];
        double sum = 0;

        // Считываем N целых чисел и находим их сумму
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }

        // Выводим сумму и среднее арифметическое
        System.out.println("Cум " + sum);
        System.out.println("Cр ариф " + sum / a.length);
    }

    // Метод для выполнения задачи 4
    public static void task4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Кол-во элементов: ");
        int N = input.nextInt();
        int[] a = new int[N];
        int sum = 0, i = 0, max, min;

        // Считываем N целых чисел с использованием цикла do-while
        do {
            a[i] = input.nextInt();
            i++;
        } while (i < a.length);

        i = 0;
        max = a[0];
        min = a[0];

        // Вычисляем сумму, максимальное и минимальное значение
        while (i < a.length) {
            sum += a[i];
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            i++;
        }

        // Выводим сумму, максимальное и минимальное значение
        System.out.println("Сум " + sum);
        System.out.println("Макс " + max);
        System.out.println("Мин " + min);
    }

    // Метод для выполнения задачи 5
    public static void task5(String[] args) {
        System.out.println("Ком строка: ");
        method1(args); // Вызываем метод method1 для вывода аргументов командной строки
    }

    // Метод для вывода аргументов командной строки
    public static void method1(String[] args) {
        for (String x : args) {
            System.out.println(x);
        }
    }

    // Метод для выполнения задачи 6
    public static void task6() {
        System.out.println("Функ 1/n");

        // Выводим значения дробей 1/n в формате "%.3f"
        for (int i = 0; i < 10; i++) {
            double n = 1.0 / (i + 1);
            String str = String.format("%.3f", n);
            System.out.println(str);
        }
    }

    // Метод для выполнения задачи 7
    public static void task7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Факториал числа: ");
        int N = input.nextInt();

        long start = System.nanoTime();
        BigInteger fact = method2(N); // Вызываем метод2 для вычисления факториала
        long end = System.nanoTime();
        System.out.println("Секунд: " + (end-start)/1000000000.0);

        System.out.println(fact);
        String factorialString = fact.toString();
        System.out.println(factorialString.length());
    }

    // Метод для вычисления факториала числа N
    public static BigInteger method2(int N) {
        int i = 1;
        BigInteger fact = new BigInteger("1");
        for (i = 1; i <= N; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        // Вызываем методы для выполнения различных задач
        //task3();
        //task4();
        //task5(args);

        //task6();
        task7();
    }
}
