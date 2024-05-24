import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s = i + 1;
            System.out.printf("%d ", s);
            for (int j = 1; j < n; j++) {
                System.out.printf("%d ", s += n);
            }
            System.out.println();
        }
    }
}