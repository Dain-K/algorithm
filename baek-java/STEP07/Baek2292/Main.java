package STEP7.Baek2292;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int range = 2;

        if (N == 1) {
            count = 1;
        } else {
            while (range <= N) {
                range = range + (count * 6);
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}