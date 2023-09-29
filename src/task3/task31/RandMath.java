package task3.task31;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int N = s.nextInt();
        Random rand = new Random();
        Float [] nums = new Float[N];
        Float [] nums1 = new Float[N];

        for (int i = 0; i < N; i++) {
            nums[i] = rand.nextFloat();
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            nums1[i] = (float) Math.random();
            System.out.print(nums1[i] + " ");
        }
        System.out.println("\n");

        Arrays.sort(nums);
        Arrays.sort(nums1);
        for (float x: nums) {
            System.out.print(x);
        }
        System.out.println();
        for (float x: nums1) {
            System.out.print(x);
        }
    }
}
