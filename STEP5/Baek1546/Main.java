package STEP5.Baek1546;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double max = 0, sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / max * 100;
            sum = sum + arr[i];
        }
        double result = sum / N;
        System.out.println(result);

        sc.close();
    }

}
