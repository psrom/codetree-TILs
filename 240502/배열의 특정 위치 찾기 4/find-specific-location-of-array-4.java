import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, cnt = 0, val;

        for (int i = 0; i < 10; i++) {
            val = sc.nextInt();
            if (val == 0) {
                break;
            }

            if (val % 2 == 0) {
                sum += val;
                cnt++;
            }
        }
        System.out.printf("%d %d", cnt, sum);
    }
}