import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n - i; j > 0; j--) {
                if (tmp == 10) {
                tmp = 1;
                }
                System.out.print(tmp + " ");
                tmp++;
            }
            System.out.println();
        }
    }
}