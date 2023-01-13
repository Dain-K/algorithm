package OneDimension.Baek2562;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0, line = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                line = i + 1;
            }
        }

        System.out.println(max + "\n" + line);
        sc.close();
    }

}
