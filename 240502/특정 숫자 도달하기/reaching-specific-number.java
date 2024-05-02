import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum, val, cnt;
        sum = 0;
        cnt = 0;

        for (int i = 0; i < 10; i++) {
            val = sc.nextInt();
            if (val >= 250) {
                break;
            }
            sum += val;
            cnt += 1;
        }
        System.out.print(sum);
        System.out.printf(" %.1f", (double)sum / cnt);
    }
}