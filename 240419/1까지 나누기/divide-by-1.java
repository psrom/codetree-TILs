import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n, cnt = 0;

        for (int i = 1; i <= n; i++) {
            tmp /= i;
            cnt += 1;

            if (tmp <= 1) {
                System.out.print(cnt);
                break;
            }
        }

        
    }
}