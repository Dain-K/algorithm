package STEP2.Baek2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int H, M;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
        if (M >= 45) {
            System.out.println(H);
            System.out.println(M - 45);
        } else {
            if (H == 0)
                H = 23;
            else
                H = H - 1;
            M = 60 - (45 - M);
            System.out.println(H);
            System.out.println(M);
        }
        sc.close();
    }

}