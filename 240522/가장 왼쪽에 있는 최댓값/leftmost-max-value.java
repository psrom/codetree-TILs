import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxIdx = n - 1;

        while (maxIdx >= 0) {
            int maxVal = Integer.MIN_VALUE;
            int currentMaxIdx = -1;

            for (int i = 0; i <= maxIdx; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    currentMaxIdx = i;
                }
            }

            System.out.print((currentMaxIdx + 1) + " ");

            maxIdx = currentMaxIdx - 1;
        }

        sc.close();
    }
}