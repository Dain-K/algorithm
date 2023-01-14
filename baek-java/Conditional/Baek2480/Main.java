package Conditional.Baek2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C, cash;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if (A == B && B == C)
            cash = 10000 + A * 1000;
        else if (A == B || B == C)
            cash = 1000 + B * 100;
        else if (A == C)
            cash = 1000 + A * 100;
        else {
            if (A > B && A > C)
                cash = A * 100;
            else if (B > A && B > C)
                cash = B * 100;
            else
                cash = C * 100;
        }
        System.out.println(cash);
        sc.close();
    }

}
