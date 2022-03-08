package STEP5.Baek2577;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int mul = A * B * C;
        int[] arr = new int[10];
        int i = 1, num = 0;

        while (true) {
            i = i * 10;
            if (mul % i < 10)
                num = mul % i;
            else
                num = (mul % i - mul % (i / 10)) / (i / 10);
            arr[num] += 1;
            if (mul < i)
                break;
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(arr[j]);
        }

        sc.close();
    }

}
