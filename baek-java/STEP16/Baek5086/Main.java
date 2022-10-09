/*
 * 첫번째 숫자가 두번째 숫자의
 * 약수라면 factor
 * 배수라면 multiple
 * 들다 아니라면 neither
 * 출력
 * */

package STEP16.Baek5086;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if ((num1 == 0) && (num2 == 0))
                break;

            if (num2 % num1 == 0) {
                System.out.println("factor");
            } else if (num1 % num2 == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

        sc.close();
    }

}