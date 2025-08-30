package word_counter;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        System.out.println("Enter n:");
        int n = sc.nextInt();

        foo(input, n);

    }
    public static void foo(String input, int n) {
        String[] words = input.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        var flag = false;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() == n) {

                System.out.println(entry.getKey());
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("there is no such quantity of coincidence " + n);
        }
    }
}
