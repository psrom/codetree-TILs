import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = 0;

            if (a % 2 == 1) {
                a++;
            }

            if (b % 2 == 1) {
                b--;
            }

            for (int j = a; j <= b; j += 2) {
                res += j;
            }
            System.out.println(res);
        }
    }
}