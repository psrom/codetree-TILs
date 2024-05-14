import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = 0, b = 0, cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            // 짝수 번째로 입력된 값의 합
            if (i % 2 == 1) {
                a += arr[i];
            }

            // 3의 배수 번째로 입력된 값의 평균
            if ((i + 1) % 3 == 0) {
                b += arr[i];
                cnt++;
            }
        }

        System.out.print(a);
        System.out.printf(" %.1f", (double)b / cnt);

    }
}