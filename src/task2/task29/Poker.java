package task2.task29;

import java.util.*;

public class Poker {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS", "AS",
                "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AH",
                "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AD",
                "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AC"
        ));
        Collections.shuffle(list);
        Scanner s = new Scanner(System.in);
        System.out.print("Кол-во человек: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Карты " + (i + 1) + " человека: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(list.get(0) + " ");
                list.remove(0);
            }
            System.out.println("\n");
        }
    }
}
