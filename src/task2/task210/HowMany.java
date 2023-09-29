package task2.task210;

import java.util.Scanner;

public class HowMany { // класс HowMany
    public static void main(String[] args) { // определение кол-ва слов в строке
        System.out.println("Введите текст:");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] strs =  str.split(" "); // разделение слов по пробелу
        System.out.print("Кол-во слов: " + strs.length);
    }
}
