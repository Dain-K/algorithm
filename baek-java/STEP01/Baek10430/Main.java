package Baek10430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C, result;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        result = ((A % C) * (B % C)) % C;
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(result);
        sc.close();
    }

}
