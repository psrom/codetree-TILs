import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if (tmp == 10) {
                    tmp = 2;
                }
                System.out.printf("%d ", tmp);
                tmp += 2;
            }
            System.out.println();
        }
    }
}