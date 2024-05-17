import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            int a = n / 10;
            if (a == 0) continue;
            arr[a] += 1;
            }

        for (int i = 10; i > 0; i--) {
            System.out.printf("%d - %d\n", i * 10, arr[i]);
        }
    }
}