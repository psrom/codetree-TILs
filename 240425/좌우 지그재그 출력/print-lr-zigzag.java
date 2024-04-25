import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = tmp; j < n + tmp; j++) {
                    System.out.printf("%d ", j);
                }
                tmp += n * 2 - 1;
            } else {
                for (int j = tmp; j > tmp - n; j--) {
                    System.out.printf("%d ", j);
                }
                tmp += 1;
            }
            System.out.println();
        }
    }
}