import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while (true) {
            if (n % 2 == 0) {
                n /= 2;
                cnt++;
            } else {
                if (n == 1) {
                    System.out.print(cnt);
                    break;
                } else {
                    n = 3 * n + 1;
                    cnt++;
                }
            }
        }
    }
}