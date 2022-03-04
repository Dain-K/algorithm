package STEP2.Baek2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if (B + C < 60) {
            System.out.println(A);
            System.out.println(B + C);
        } else {
            if (A + (B + C) / 60 > 23)
                A = (A + (B + C) / 60) - 24;
            else
                A = A + (B + C) / 60;
            B = (B + C) % 60;
            System.out.println(A);
            System.out.println(B);
        }
        sc.close();
    }
}
