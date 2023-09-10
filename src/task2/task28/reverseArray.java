package task2.task28;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseArray {

    public static void revers(ArrayList<String> list) {
        String sym;
        int N = list.size();
        for (int i = 0; i < N / 2; i++) {
            sym = list.get(N - i - 1);
            list.set(N - i - 1, list.get(i));
            list.set(i, sym);
        }
    }
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.print("Кол-во чисел: ");
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(s1.nextLine());
        }
        revers(list);
        System.out.print(list);
    }
}
