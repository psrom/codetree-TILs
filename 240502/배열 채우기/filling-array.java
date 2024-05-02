import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int val = 0;

        for (int i = 0; i < 10; i++) {
            val = sc.nextInt();
            if (val == 0) {
                break;
            }
            arr[i] = val;
            cnt++;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}