package task1;

import java.util.Scanner;

public class Main {
    public static void task3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Кол-во элементов: ");
        int N = input.nextInt();
        int[] a = new int [N];
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        System.out.println("Cум " + sum);
        System.out.println("Cр ариф " + sum/a.length);
    }
    public static void task4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Кол-во элементов: ");
        int N = input.nextInt();
        int[] a = new int [N];
        int sum = 0, i = 0, max, min;
        do {
            a[i] = input.nextInt();
            i++;
        } while(i < a.length);
        i = 0;
        max = a[0];
        min = a[0];
        while(i < a.length){
            sum+=a[i];
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            i++;
        }
        System.out.println("Сум " + sum);
        System.out.println("Макс " + max);
        System.out.println("Мин " + min);
    }

    public static void task5(String[] args) {
        System.out.println("Ком строка: ");
        method1(args);
    }
    public static void method1(String[] args) {
        for (String x : args) {
            System.out.println(x);
        }
    }
    public static void task6() {
        System.out.println("Функ 1/n");
        for (int i = 0; i < 10; i++) {
            double n = 1.0/(i + 1);
            String str = String.format("%.3f", n);
            System.out.println(str);
        }
    }
    public static void task7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Факториал числа: ");
        int N = input.nextInt();

        int fact = method2(N);
        System.out.print(fact);
    }
    public static int method2(int N) {
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        task3();
        task4();
        task5(args);
        task6();
        task7();
    }
}