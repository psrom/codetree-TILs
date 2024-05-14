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
            if ((i + 1) % 2 == 0) {
                a += arr[i];
            }
            else if ((i + 1) % 3 == 0) {
                b += arr[i];
                cnt++;
            }
        }

        System.out.print(a);
        System.out.printf(" %.1f", (double)b / cnt);

    }
}