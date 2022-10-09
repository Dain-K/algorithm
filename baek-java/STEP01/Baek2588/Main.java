package Baek2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, result;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        result = A * (B % 10);
        System.out.println(result);

        result = (A * (B % 100 - B % 10)) / 10;
        System.out.println(result);

        result = (A * (B - B % 100)) / 100;
        System.out.println(result);

        System.out.println(A * B);

        sc.close();
    }

}