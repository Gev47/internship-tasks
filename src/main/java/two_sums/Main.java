package two_sums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 3, 5, 6, 9, 11, 12, 14, 18};
        int sum = 12;
        findPair(array, sum);
    }

    public static void findPair(int[] array, int sum) {
        Arrays.sort(array);
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            int s = array[l] + array[r];
            if (s > sum) {
                r--;
            }
            else if (s < sum) {
                l++;
            }
            else {
                System.out.println(array[l] + " + " + array[r] + " = " + sum);
                return;
            }
        }
        System.out.println("no such pair");
    }
}
