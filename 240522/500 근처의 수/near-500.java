import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int lower = Integer.MIN_VALUE, upper = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int a = arr[i];
            if (a < 500) {
                if (a > lower) {
                    lower = a;
                }
            } else {
                if (a < upper) {
                    upper = a;
                }
            }

        }

        System.out.printf("%d %d", lower, upper);
    }
}