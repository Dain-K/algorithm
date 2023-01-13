

import java.util.*;

public class B1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int firstN = N;
        int i = 0;
        while (true) {
            int A = N / 10;
            int B = N % 10;
            int C = A + B;
            N = B * 10 + (C % 10);
            i++;
            if (firstN == N)
                break;
        }
        System.out.println(i);
        sc.close();
    }

}