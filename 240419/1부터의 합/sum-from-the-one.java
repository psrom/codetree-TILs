import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 0;

        for (int i = 1; i <= 100; i++) {
            tmp += i;

            if (tmp >= n) {
                System.out.print(i);
                break;
            }
        }
    }
}