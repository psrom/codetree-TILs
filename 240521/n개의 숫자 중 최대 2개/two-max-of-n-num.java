import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal1 = INT_MIN, maxVal2 = INT_MIN;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > maxVal1) {
                maxVal1 = a;
                continue;
            }

            if (maxVal1 >= maxVal2 && a > maxVal2) {
                maxVal2 = a;
            }
        }

        System.out.printf("%d %d", maxVal1, maxVal2);
    }
}