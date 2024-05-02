import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int val;

        for (int i = 0; i < n; i++) {
            val = sc.nextInt();
            cnt++;
            if (val % 2 != 0) {
                arr[i] = -1;
            } else {
                arr[i] = val;
            }
        }

        for (int i = cnt - 1; i >= 0; i--) {
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}