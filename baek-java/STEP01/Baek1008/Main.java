package Baek1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        double result;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        result = a / b;
        System.out.println(result);
        sc.close();
    }
}